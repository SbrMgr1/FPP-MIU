package com.fpp.AssertTest;

public class HelloAssert {
	public static void main( String[] args ) {

        System.out.println("Hello World3");
        
        int x = 5;
        x++;
        assert x == 2 : "x is " + x;
        
        System.out.println("Hello World4");
        System.out.println("Hello World5");
        int a = Integer.MIN_VALUE;

    }

}
