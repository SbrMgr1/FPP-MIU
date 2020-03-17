package com.fpp.Lession9Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab_1 {
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>();
		stack.push('1');
		stack.push('2');
		stack.push('3');
		stack.push('4');
		stack.push('5');

		Queue<Character> queue = new LinkedList<Character>();
		
		System.out.println("Elements in stack before moving into Queue\nStack:"+stack+" \nQueue:"+queue);
		stackToQueue(stack,queue);
		System.out.println("Elements in stack after moving into Queue\nStack:"+stack+" \nQueue:"+queue);

		System.out.println("-------------------------");
		System.out.println("Elements in queue before moving into Stack\nStack:"+queue+" \nStack:"+stack);		
		queueToStack(queue,stack);
		System.out.println("Elements in queue after moving into Stack\nStack:"+queue+" \nStack:"+stack);
		System.out.println("-------------------------");
		stack.clear();
		stack.push('1');
		stack.push('2');
		stack.push('3');
		stack.push('4');
		stack.push('5');
		Stack<Character> targetStack = new Stack<Character>();
		System.out.println("Elements in first stack before moving into Target Stack\nFirst Stack:"+stack+" \nTarget Stack:"+targetStack);
		stackToStack(stack, targetStack);
		System.out.println("Elements in first stack after moving into Target Stack\nFirst Stack:"+stack+" \nTarget Stack:"+targetStack);
	}

	public static void stackToQueue(Stack<Character> stack, Queue<Character> queue) {
		if(stack == null) {
			return;
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

	}

	public static void queueToStack(Queue<Character> queue,Stack<Character> stack) {

		if(queue == null) {
			return;
		}
		while (!queue.isEmpty()) {
			stack.push(queue.poll());
		}

	}

	public static void stackToStack(Stack<Character> stack, Stack<Character> target) {

		Stack<Character> middleStack = new Stack<Character>();

		while (!stack.isEmpty()) {
			middleStack.push(stack.pop());
		}
		stack.clear();

		while (!middleStack.isEmpty()) {
			target.push(middleStack.pop());
		}
	}
}
