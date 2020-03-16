package com.fpp.stdXm;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws QueueException{
		if(isEmpty()) {
			throw new QueueException("Queue is empty");
		}else {
			return arr[rear-1];
		}
		
		// implement
	}

	public void enqueue(int obj) {
		if (rear < arr.length) {
			arr[rear] = obj;
		}else {
			int[] tmp = new int[arr.length+1];
			System.arraycopy(arr, 0, tmp, 0, arr.length);
			arr = tmp;
			arr[rear] = obj;
		}
		rear++;
	}

	public int dequeue() throws QueueException{
		try {
			
			return arr[++front];
			
			
		} catch (Exception e) {
			throw new QueueException(e);
			// TODO: handle exception
		}
	}

	public boolean isEmpty() {
		if((rear + front) == -1) {
			return true;
		}
		return false;
	}

	public int size() {
		// implement
		return rear-front-1;
	}

}
