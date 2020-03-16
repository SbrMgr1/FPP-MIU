package com.fpp.Ass5_1;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee{
	private String name;
	private Date hireDate;
	private double salary = 10;
	

	public void setName(String nameArg) {
		name = nameArg;
	}
	public String getName() {
		return name;
	}
	public void setHireDate(int yearOfHire, int monthOfHire, int dayOfHire) {
		GregorianCalendar gc = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = gc.getTime();
	}
	public double computeSalary() {
		return salary;
	}
}
