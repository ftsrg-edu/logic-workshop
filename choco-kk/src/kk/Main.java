package kk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.LCF;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class Main {

	
	
	
	static void ifOnlyIf(BoolVar v, Constraint c) {
		LCF.ifThen(v, c);
		LCF.ifThen(v.not(), LCF.not(c));
	}

	static void f(List<String> variableNames) {
		Map<String, BoolVar> variableMapping = new HashMap<>();
		
		Solver solver = new Solver();
		for (String variableName : variableNames) {
			BoolVar boolVar = VariableFactory.bool(variableName, solver);
			variableMapping.put(variableName, boolVar);
		}
		
		// TODO
		BoolVar a = variableMapping.get("A");
		BoolVar b = variableMapping.get("B");
		
		
		// TODO
		Constraint c1 = LCF.or(a.not(), b.not());
		ifOnlyIf(a, c1);
		
		if (solver.findSolution()) {
			do {
				for (BoolVar value : variableMapping.values()) {
					System.out.println(value);
				}
			} while (solver.nextSolution());
		}
	}

	static void f2() {
		Solver solver = new Solver();
		BoolVar a = VariableFactory.bool("A", solver);
		BoolVar b = VariableFactory.bool("B", solver);

		Constraint c1 = LCF.or(a.not(), b);
		ifOnlyIf(a, c1);

		if (solver.findSolution()) {
			do {
				System.out.println(a);
				System.out.println(b);
			} while (solver.nextSolution());
		}
	}

	static void f3() {
		Solver solver = new Solver();
		BoolVar a = VariableFactory.bool("A", solver);
		BoolVar b = VariableFactory.bool("B", solver);

		Constraint c1 = LCF.and(a.not(), b);
		ifOnlyIf(a, c1);

		if (solver.findSolution()) {
			do {
				System.out.println(a);
				System.out.println(b);
			} while (solver.nextSolution());
		}
	}

	static void f4() {
		Solver solver = new Solver();
		BoolVar a = VariableFactory.bool("A", solver);
		BoolVar b = VariableFactory.bool("B", solver);
		BoolVar c = VariableFactory.bool("C", solver);

		Constraint c1 = LCF.and(a.not(), b.not(), c.not());
		ifOnlyIf(a, c1);

		Constraint c2A = LCF.and(a, b.not(), c.not());
		Constraint c2B = LCF.and(a.not(), b, c.not());
		Constraint c2C = LCF.and(a.not(), b.not(), c);
		Constraint c2 = LCF.and(c2A, c2B, c2C);
		ifOnlyIf(b, c2);
		
		LCF.

		if (solver.findSolution()) {
			do {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			} while (solver.nextSolution());
		}

	}

	public static void main(String[] args) {
		Logger rootLogger = (Logger) LoggerFactory
				.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
		rootLogger.setLevel(Level.OFF);

		String[] vars = {"A", "B"};
		
		f(Arrays.asList(vars));
//		System.out.println();
//		f2();
//		System.out.println();
//		f3();
//		System.out.println();
//		f4();
//		System.out.println();

	}
}
