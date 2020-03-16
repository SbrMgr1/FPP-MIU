package com.fpp.Ass5_1;

public class Administrator extends DeptEmployee{
	private double hourWorked = 0;
	public Administrator(String nameArg, int yearOfHire, int monthOfHire, int dayOfHire) {
		super.setName(nameArg);
		super.setHireDate(yearOfHire, monthOfHire, dayOfHire);
	}
	public void setHourWorked(double hr) {
		hourWorked = hr;
	}
	

	public double computeSalary() {
		return this.hourWorked*12;
	}
}
