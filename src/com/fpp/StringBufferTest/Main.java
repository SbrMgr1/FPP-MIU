package com.fpp.StringBufferTest;

public class Main {
	public static void main(String[] args) {
		
		StringBuffer  sb = new StringBuffer(new String("Java"));

		sb.setCharAt(0, 'D');
		sb.setCharAt(1, 'i');

		sb.insert(sb.length(),"hello");
		sb.replace(0,2,"Ja");
		
		System.out.println(sb.toString());

	}
}
