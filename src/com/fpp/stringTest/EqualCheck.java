package com.fpp.stringTest;

public class EqualCheck {
	public static void main(String[] args) {
		String a = new String("123456");
		String b = new String("123456");
		
		if(b.equals(b)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
	}
}
