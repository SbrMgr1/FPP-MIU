package com.fpp.Ass5_2;

public class Rectangle extends ClosedCurve {
	private double height;
	private double width;

	public Rectangle(Double height, Double width) {
		this(height.doubleValue(), width.doubleValue());
	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	double computeArea() {
		return height * width;
	}

}
