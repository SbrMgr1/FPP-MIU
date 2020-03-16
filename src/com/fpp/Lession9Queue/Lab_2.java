package com.fpp.Lession9Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input string with \":\" separated");

		String inputValue = input.next();
		System.out.println("Result:" + produceChar(inputValue));

	}

	private static char produceChar(String str) {
		if (str == null) {
			return 'N';
		}
		
		Queue<Character> queue = new LinkedList<Character>();

		char ch;
		boolean semicolonFound = false;
		int rightCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == ':') {
				semicolonFound = true;
			} else {
				if (semicolonFound == false) {
					queue.add(ch);
				} else {
					rightCnt++;
				}
			}

		}
		if (semicolonFound == false) {
			return 'N';
		} else if (queue.size() > rightCnt) {
			return 'L';
		} else if (queue.size() < rightCnt) {
			return 'R';
		} else {
			return 'S';
		}
	}
}
