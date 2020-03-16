package com.fpp.Ass5_1;
public class Professor extends DeptEmployee{
	
	public Professor(String nameArg, int yearOfHire, int monthOfHire, int dayOfHire) {
		super.setName(nameArg);
		super.setHireDate(yearOfHire, monthOfHire, dayOfHire);
	}
	private int numberOfPublications = 0;

	public void setNumberOfPublications(int publicationNum) {
		numberOfPublications = publicationNum;
	}
	public int setNumberOfPublications() {
		return numberOfPublications;
	}
	public double computeSalary() {
		return super.computeSalary();
	}
}
