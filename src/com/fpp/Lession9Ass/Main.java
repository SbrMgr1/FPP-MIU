package com.fpp.Lession9Ass;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose the following options");
		System.out.println("A. Lab 1 and Lab 1b");
		System.out.println("B. LaB 2a");

		String opt = input.next();
		switch (opt) {
		case "A":
			new Prob_1();
			break;
		case "B":
			System.out.println("Enter any equation with opening and closing brackets to check Symbols are balanced or not.");
			String equation = input.next();
//			String equation = "(a + b[(x+y)] + 10)";
			System.out.println("Symbol balance result: " + new SymbolBalancingAlgorithm().run(equation));
			break;

		default:
			break;
		}

	}
}
