package hu.bme.mit.kk

import com.google.common.collect.Maps
import hu.bme.mit.kk.dsl.language.And
import hu.bme.mit.kk.dsl.language.Iff
import hu.bme.mit.kk.dsl.language.Model
import hu.bme.mit.kk.dsl.language.Negationable
import hu.bme.mit.kk.dsl.language.Or
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VariableFactory

import static org.chocosolver.solver.constraints.LogicalConstraintFactory.*
import hu.bme.mit.kk.dsl.language.Person
import hu.bme.mit.kk.dsl.language.KnightReference
import hu.bme.mit.kk.dsl.language.KnaveReference
import org.chocosolver.util.ESat

class KKSolver {

	val variableMapping = Maps.<Person, BoolVar>newHashMap

	public def solve(Model model) {
		val solver = new Solver

		model.people.forEach [
			variableMapping.put(it, VariableFactory.bool(it.name, solver))
		]

		model.statements.forEach [
			ifOnlyIf(variableMapping.get(it.person), it.expression.transform)
		]

		var result = '''
			Results
			-------
			'''

		if (solver.findSolution()) {
			do {
				result = result.concat("\n" + model.people.map[it.getName + variableMapping.get(it).booleanValue.prettyprint])
			} while (solver.nextSolution)
		}
		result
	}

	public def ifOnlyIf(BoolVar v, Constraint c) {
		ifThen(v, c)
		ifThen(v.not(), not(c));
	}

	// ---
	public dispatch def Constraint transform(And and) {
		and(and.left.transform, and.right.transform)
	}

	public dispatch def Constraint transform(Or or) {
		or(or.left.transform, or.right.transform)
	}

	public dispatch def Constraint transform(Iff iff) {
		or(
			and(iff.left.transform, iff.right.transform),
			and(not(iff.left.transform), not(iff.right.transform))
		)
	}

	public dispatch def Constraint transform(Negationable not) {
		not(not.value.transform)
	}

	public dispatch def Constraint transform(KnightReference ref) {
		val boolVar = variableMapping.get(ref.person)
		and(boolVar)
	}
	
	public dispatch def Constraint transform(KnaveReference ref) {
		val boolVar = variableMapping.get(ref.person)
		not(and(boolVar))
	}
	
	public def String prettyprint(ESat bool) {
		if(bool == ESat.TRUE)
			return " is a knight"
		else
			return " is a knave"
	}
}
