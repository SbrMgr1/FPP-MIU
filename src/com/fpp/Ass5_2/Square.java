package com.fpp.Ass5_2;


public class Square extends ClosedCurve {
	double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
}
