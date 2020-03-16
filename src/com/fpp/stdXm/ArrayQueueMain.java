package com.fpp.stdXm;

public class ArrayQueueMain {
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
//		q.peek();
		for (int i = 0; i < 15; i++)
			q.enqueue(i);
		for (int i = 0; i < 15; i++)
			try {
				System.out.println(q.dequeue());
			} catch (Exception e) {
				// TODO: handle exception
			}

		System.out.println(q.size());
//		try {
//			System.out.println(q.peek());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
}
