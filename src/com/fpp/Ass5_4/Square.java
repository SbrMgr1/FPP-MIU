package com.fpp.Ass5_4;


public class Square implements Polygon{
	double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return side*this.getNumberOfSides();
	}
}
