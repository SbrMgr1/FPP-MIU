package com.fpp.Ass5_4;

public class Test2 {

	public static void main(String[] args) {

		Polygon[] objects = { new Square(3), 
				new Triangle(4, 5, 6),
				new Rectangle(4, 3) };
		// compute areas
		for (Polygon cc : objects) {
			System.out.println(String.format("For this %s\n" + "  Number of sides = %d\n" + "  Perimeter = %.1f\n" + "",
					cc.getClass().getSimpleName(), cc.getNumberOfSides(), cc.computePerimeter()));

		}

	}

}
