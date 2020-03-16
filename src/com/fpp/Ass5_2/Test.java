package com.fpp.Ass5_2;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(12, 8),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(String.format("The area of this %s is %f",cc.getClass().getSimpleName(), cc.computeArea()));
			
		}
    
	}

}
