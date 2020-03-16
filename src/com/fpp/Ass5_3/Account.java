package com.fpp.Ass5_3;

abstract class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
		
	}


	public String toString() {
//		return "Account type:"  + "\nbal: " + balance+"\n";
		return "Balance: " + balance+"\n";
	}

	public void makeDeposit(double deposit) {
		this.balance +=deposit;// new added
	}
	public double getBalance() {
		return balance;
	}

	public boolean makeWithdrawal(double amount) {
		//added new
		if(this.balance < amount) {
			return false;
		}else {
			this.balance -= amount;
			return true;
		}
		
	}
	public abstract AccountType getAcctType();
	
	public abstract double computeInterest();
}
