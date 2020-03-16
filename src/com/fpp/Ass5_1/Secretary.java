package com.fpp.Ass5_1;

public class Secretary extends DeptEmployee{
	
	public Secretary(String nameArg, int yearOfHire, int monthOfHire, int dayOfHire) {

		super.setName(nameArg);
		super.setHireDate(yearOfHire, monthOfHire, dayOfHire);
		// TODO Auto-generated constructor stub
	}
	private double overtimeHours = 0;

	public void setOvertimeHours(double hr) {
		overtimeHours = hr;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}
	public double computeSalary() {
		return (12*overtimeHours) + super.computeSalary();
	}
}
