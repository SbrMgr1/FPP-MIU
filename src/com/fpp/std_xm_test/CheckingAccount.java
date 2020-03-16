package com.fpp.std_xm_test;

final public  class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	public double getBalance() {
		return balance;
	}
}
