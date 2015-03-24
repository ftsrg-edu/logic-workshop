package hu.bme.mit.kk

import com.google.common.collect.Maps
import hu.bme.mit.kk.dsl.language.And
import hu.bme.mit.kk.dsl.language.Iff
import hu.bme.mit.kk.dsl.language.Model
import hu.bme.mit.kk.dsl.language.Negation
import hu.bme.mit.kk.dsl.language.Or
import hu.bme.mit.kk.dsl.language.Variable
import hu.bme.mit.kk.dsl.language.VariableReference
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VariableFactory

import static org.chocosolver.solver.constraints.LogicalConstraintFactory.*

class KKSolver {

	val variableMapping = Maps.<Variable, BoolVar>newHashMap

	public def solve(Model model) {
		val solver = new Solver

		model.variables.forEach [
			variableMapping.put(it, VariableFactory.bool(it.name, solver))
		]

		model.statements.forEach [
			ifOnlyIf(variableMapping.get(it.variable), it.expression.transform)
		]

		var result = '''
			Results
			-------
			'''

		if (solver.findSolution()) {
			do {
				result = result.concat("\n" + model.variables.map[variableMapping.get(it)].map[it.toString])
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

	public dispatch def Constraint transform(Negation not) {
		not(not.value.transform)
	}

	public dispatch def Constraint transform(VariableReference ref) {
		val boolVar = variableMapping.get(ref.value)
		and(boolVar)
	}
}
