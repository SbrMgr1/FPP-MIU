package com.fpp.Ass5_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		DeptEmployee[] departments = new DeptEmployee [6];
		//3 professor and two secretary
		
		Professor professor1 = new Professor("Tom",1990,11,23);
		professor1.setNumberOfPublications(10);
		departments[0] = professor1;
	
		Professor professor2 = new Professor("Eistein",1991,12,1);
		professor2.setNumberOfPublications(10);
		departments[1] = professor2;
		
		Professor professor3 = new Professor("Joseph",1990,11,28);
		professor3.setNumberOfPublications(10);
		departments[2] = professor3;
		
		
		Secretary secretary1 = new Secretary("Michael",2000,1,23);
		secretary1.setOvertimeHours(200);
		departments[3] = secretary1;
		
		Secretary secretary2 = new Secretary("Jack",1989,12,12);
		secretary2.setOvertimeHours(200);
		departments[4] = secretary2;
		
		
		Administrator admin = new Administrator("Rein",1989,12,12);
		admin.setHourWorked(12);
		departments[5] = admin;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see the sum of all salaries in the department? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			System.out.println(String.format("Total Salary is: $%.2f",getFormattedOutput(departments)));
		}else {
			//do nothing..the application ends here
		}
		
		
		System.out.print("Do you want to see the details of user? (y/n) ");
		String yesNo = sc.next();
		if(yesNo.equalsIgnoreCase("y")){
			System.out.print("Please the name");
			String name = sc.next();
			boolean found = false;
			for(DeptEmployee department:departments) {
				//System.out.println(String.format("%s gets salary of $%.2f", department.getName(),department.computeSalary()));
				if(department.getName().equals(name)) {
					found = true;
					System.out.println(String.format("%s gets salary of $%.2f", department.getName(),department.computeSalary()));
				}
				
				
			}
			if(found == false) {
				System.out.println("User Not found");
			}
			
		}else {
			//do nothing..the application ends here
		}
	}
	private static double getFormattedOutput(DeptEmployee[] departmentsArg) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double salary = 0;
//		for(DeptEmployee department:departmentsArg) {
//			System.out.println("Enter the salary for "+ department.getName());
//			//department.salary = sc.nextDouble();
//			
//		}
		for(DeptEmployee department:departmentsArg) {

			salary = department.computeSalary();
			total += salary;
			//System.out.println(String.format("%s gets salary of $%.2f", department.getName(),salary));
			
		}
		return total;
	}
}
