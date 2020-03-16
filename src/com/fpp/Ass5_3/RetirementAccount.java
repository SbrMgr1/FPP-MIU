package com.fpp.Ass5_3;

public class RetirementAccount extends Account{

	RetirementAccount(Employee emp,double amt) {
		super(emp,amt);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	public double computeInterest() {
		return super.getBalance()*0.05;
	}
	public boolean makeWithdrawal(double amount) {
		//added new
		amount += amount*2/100;
		return super.makeWithdrawal(amount);
		
	}
	public String toString() {
		return "Account type: Retirement"  + "\nbal: " + this.getBalance()+"\n";
	}

}
