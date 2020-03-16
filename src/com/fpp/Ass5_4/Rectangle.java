package com.fpp.Ass5_4;

public class Rectangle implements Polygon{
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
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*height+2*width;
	}

}
