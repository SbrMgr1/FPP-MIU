package com.fpp.Lession9Ass;

import java.util.Scanner;
import java.util.Stack;

public class Prob_1 {
	public Prob_1() {
		Stack stack = new Stack();
		Scanner input = new Scanner(System.in);
		int inputInt;
		int count = 0;
		while(true){
			
			if (count == 0) {
				System.out.println("Enter the number to push into the stack. And enter -1 not to add more number");
			} else {
				System.out.println("Enter the more number. And enter -1 not to add more number");
			}

			inputInt = input.nextInt();
			if (inputInt == -1) {
				break;
			} else {
				stack.push((int) inputInt);
			}
			count++;

		}
		stack.set(0,"and "+stack.get(0));

		System.out.println("Collection in stack:");while(!stack.isEmpty())
		{
			System.out.println(stack.pop());

		}
	}
}
