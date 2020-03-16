package com.fpp.Ass5_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Employee> emps = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		

		emps.add(new Employee("Jim Daley", 2000, 9, 4));
		emps.add(new Employee("Bob Reuben", 1998, 1, 5));
		emps.add(new Employee("Susan Randolph", 1997, 2,13));

		
		emps.get(0).createNewChecking(10500);
		emps.get(0).createNewSavings(1000);
		emps.get(0).createNewRetirement(9300);
		
		emps.get(1).createNewChecking(34000);
		emps.get(1).createNewSavings(27000);
		
		emps.get(2).createNewChecking(10038);
		emps.get(2).createNewSavings(12600);
		emps.get(2).createNewRetirement(9000);	
		
//		for phase I – console output
		System.out.println("A. See a report of all accounts.\nB. Make a deposit.\nC. Make a withdrawal.\nMake a selection (A/B/C):");
		
		String optionSelected = sc.next();
		if(optionSelected.equalsIgnoreCase("A")){
			System.out.println(getFormattedAccountInfo());
		}else if(optionSelected.equalsIgnoreCase("B")){// for deposit
			
			int selectedEmployee =  getEmployeeFromInput();
			if(selectedEmployee >=0 && selectedEmployee<emps.size()) {

				int accType = selectAccTypeFromInput();
				if(accType >=0 && accType<=2) {
					System.out.println("Deposit amount: ");
					double depositAmt = sc.nextDouble();
					
					if(accType == 0) {//checking
						emps.get(selectedEmployee).deposit(AccountType.CHECKING, depositAmt);
						System.out.printf("$%.2f has been deposited in the \n" + 
								"checking account of %s\n" + 
								"",depositAmt,emps.get(selectedEmployee).getName());
					}else if(accType == 1) {//savings
						emps.get(selectedEmployee).deposit(AccountType.SAVINGS, depositAmt);
						System.out.printf("$%.2f has been deposited in the \n" + 
								"savings account of %s\n" + 
								"",depositAmt,emps.get(selectedEmployee).getName());
					}else {//retirement
						emps.get(selectedEmployee).deposit(AccountType.RETIREMENT, depositAmt);
						System.out.printf("$%.2f has been deposited in the \n" + 
								"retirement account of %s\n" + 
								"",depositAmt,emps.get(selectedEmployee).getName());
					}
					System.out.println("==================================");
					System.out.println(getFormattedAccountInfo());
				}else {
					System.out.println("You put invalid Input.");
				}
			}else {
				System.out.println("You put invalid Input.");
			}
		}else if(optionSelected.equalsIgnoreCase("C")){
			int selectedEmployee =  getEmployeeFromInput();
			if(selectedEmployee >=0 && selectedEmployee<emps.size()) {

				int accType = selectAccTypeFromInput();
				if(accType >=0 && accType<=2) {
					System.out.println("Withdrawal amount: ");
					double withdrawalAmt = sc.nextDouble();
					
					if(accType == 0) {//checking
						
						System.out.printf(emps.get(selectedEmployee).withdraw(AccountType.CHECKING, withdrawalAmt)+" Name:"+emps.get(selectedEmployee).getName()+"\n");
					}else if(accType == 1) {//savings
						
						System.out.printf(emps.get(selectedEmployee).withdraw(AccountType.SAVINGS, withdrawalAmt)+" Name:"+emps.get(selectedEmployee).getName()+"\n");
					}else {//retirement

						System.out.printf(emps.get(selectedEmployee).withdraw(AccountType.RETIREMENT, withdrawalAmt)+" Name:"+emps.get(selectedEmployee).getName()+"\n");
					}
					System.out.println("==================================");
					System.out.println(getFormattedAccountInfo());
				}else {
					System.out.println("You put invalid Input.");
				}
			}else {
				System.out.println("You put invalid Input.");
			}
		}else {
			System.out.println("You put invalid Input.");
		}	
		
		System.out.println("Total Balance is $"+AllEmployeesTotalOfAllBalances());
	}
	private int getEmployeeFromInput() {

		for(int i=0; i<emps.size();i++) {
			System.out.printf("%d. %s\n",i,emps.get(i).getName());
		}
		System.out.println("Select an employee: (type a number)");
		return sc.nextInt();
	}
	private int selectAccTypeFromInput() {
		System.out.println("0. checking\n" + 
				"1. savings\n" + 
				"2. retirement\n" + 
				"");
		System.out.println("Select an account: (type a number) ");

		return sc.nextInt();
	}
	String getFormattedAccountInfo() {

		String infos = "";
		for(Employee emp: emps) {
			infos += emp.getFormattedAcctInfo()+"\n";
			
		}
		return infos;
		
	}
	double AllEmployeesTotalOfAllBalances() {
		double balance = 0;
		for(int i=0; i<emps.size();i++) {
			balance += emps.get(i).totalOfAllBalances();
		}
		return balance;
	}  
	

}
