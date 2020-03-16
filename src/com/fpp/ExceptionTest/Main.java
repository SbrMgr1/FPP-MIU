package com.fpp.ExceptionTest;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str = "Test";
		changeStr(str);
		System.out.println(str);
	}
	public static void changeStr(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.append(" is going on here.");
	}
}