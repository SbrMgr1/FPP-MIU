package com.fpp.Ass4_2;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {

		if(acctType == AccountType.SAVINGS) {
			savingsAcct.makeDeposit(amt);
		}else if(acctType == AccountType.CHECKING) {
			checkingAcct.makeDeposit(amt);
		}else if(acctType == AccountType.RETIREMENT) {
			checkingAcct.makeDeposit(amt);
		}	
		
	}
	
	public String getName() {//getter of name
		return name;
	}
	
	public Date getHireDate() {//getter of hireDate
		return hireDate;
	} 
	

	public boolean withdraw(AccountType acctType, double amt) {
		if(acctType == AccountType.SAVINGS) {
			return savingsAcct.makeWithdrawal(amt);
		}else if(acctType == AccountType.CHECKING) {
			return checkingAcct.makeWithdrawal(amt);
		}else {//AccountType.RETIREMENT
			return checkingAcct.makeWithdrawal(amt);
		}
	}

	public String getFormattedAcctInfo() {
		String info = "";
		if (this.savingsAcct != null) {
			info += savingsAcct.toString();
		}
		if (this.checkingAcct != null) {
			info += checkingAcct.toString();
		}
		if (this.retirementAcct != null) {
			info += retirementAcct.toString();
		}
		return info;
	}


}
