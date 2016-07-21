package hu.bme.mit.kk.solver.prototype;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;
import org.chocosolver.util.ESat;

public class Main {
	public static void main(String[] args) {
		Solver solver = new Solver();

		// A (B) is a knight <-> A (B) is true
		BoolVar a = VariableFactory.bool("A", solver);
		BoolVar b = VariableFactory.bool("B", solver);

		// Statement: one of us is a knave
		Constraint c = LogicalConstraintFactory.or(a.not(), b.not());
		
		// Constraints: the statement is true or false depending on the person's identity 
		LogicalConstraintFactory.ifThen(a, c);
		LogicalConstraintFactory.ifThen(a.not(), c.getOpposite());

		boolean solutionFound = solver.findSolution();
		
		if (solutionFound) {
			do {
				System.out.println("--- Result ---");
				System.out.println(a.getBooleanValue() == ESat.TRUE ? "A is a knight" : "A is a knave");
				System.out.println(b.getBooleanValue() == ESat.TRUE ? "B is a knight" : "B is a knave");
			} while (solver.nextSolution());
		}
	}
}
