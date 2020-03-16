package com.fpp.Ass5_3;

public class CheckingAccount extends Account{

	CheckingAccount(Employee emp,double amt) {
		super(emp,amt);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
	
	public double computeInterest() {
		return super.getBalance()*0.02;
	}
	public boolean makeWithdrawal(double amount) {
		//added new
		return super.makeWithdrawal(amount);
		
	}
	public String toString() {
		return "Account type: Checking"  + "\nbal: " + this.getBalance()+"\n";
	}
	public double getBalance() {
		double baseBalance = super.getBalance();
		if(baseBalance < 5) {
			return 0;
		}else {
			return baseBalance - 5;
		}
		
	}

}
