package com.fpp.Ass5_3;

public class SavingsAccount extends Account{

	SavingsAccount(Employee emp,double amt) {
		super(emp,amt);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	public double computeInterest() {
		return super.getBalance()*0.04;
//		}
	}
	public boolean makeWithdrawal(double amount) {
		//added new
		return super.makeWithdrawal(amount);
		
	}
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (0.25/100)*baseBalance;
		return baseBalance + interest;
	}
	public String toString() {
		return "Account type: Savings"  + "\nbal: " + this.getBalance()+"\n";
	}


}
