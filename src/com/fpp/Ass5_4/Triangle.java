package com.fpp.Ass5_4;


//IGNORE many of the details in this file!



public class Triangle implements Polygon{
	
	double side1;
	double side2;
	double side3;
	
	private final double DEFAULT_SIDE = 5.0;
     
    public Triangle(Double s1, Double s2, Double s3){
		this(s1.doubleValue(),s2.doubleValue(),s3.doubleValue());
	}
	public Triangle(double side1, double side2, double side3)  {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	public void setValues(double x, double y, double z){
		side1 = x;
		side2 = y;
		side3 = z;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}

}
