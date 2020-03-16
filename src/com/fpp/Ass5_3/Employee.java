package com.fpp.Ass5_3;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {


	private ArrayList<Account> accounts = new ArrayList<Account>();
	

	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}
	


	public void createNewChecking(double startAmount) {
		CheckingAccount checkingAccount = new CheckingAccount(this, startAmount);
		accounts.add(checkingAccount);

	}

	public void createNewSavings(double startAmount) {
		SavingsAccount savingAccount = new SavingsAccount(this,startAmount);
		accounts.add(savingAccount);
	}

	public void createNewRetirement(double startAmount) {
		RetirementAccount retirementAccount = new RetirementAccount(this,startAmount);
		accounts.add(retirementAccount);
	}
	
	public void deposit(AccountType acctType, double amt) {
		
		if(accounts != null) {
			for(Account account: accounts) {
				System.out.println(acctType);
				if(account.getAcctType() == acctType) {
					
					account.makeDeposit(amt);
				}
			}
		}	
		
	}
	
	public String getName() {//getter of name
		return name;
	}
	
	public Date getHireDate() {//getter of hireDate
		return hireDate;
	} 
	

	public String withdraw(AccountType acctType, double amt) {
		
		if(accounts != null) {
			String result = "";
			boolean found = false;
			for(Account account: accounts) {
				
				if(account.getAcctType() == acctType) {
					if(account.getAcctType() == AccountType.CHECKING) {
						CheckingAccount checkingAccount = (CheckingAccount)account;
						if(checkingAccount.makeWithdrawal(amt) == true) {
							return "Success";
						}else {
							return "Your withdrwal cannot be made because of ensufficient balance.";
						}
					}else if(account.getAcctType() == AccountType.SAVINGS) {
						SavingsAccount savingsAccount = (SavingsAccount)account;

						if(savingsAccount.makeWithdrawal(amt) == true) {
							return "Success";
						}else {
							return "Your withdrwal cannot be made because of ensufficient balance.";
						}
					}else if(account.getAcctType() == AccountType.RETIREMENT) {
						RetirementAccount retirementAccount = (RetirementAccount)account;
						if(retirementAccount.makeWithdrawal(amt) == true) {
							return "Success. 2% panalty has been applied to your balance.";
						}else {
							return "Your withdrwal cannot be made because of ensufficient balance.";
						}
					}
					
					found = true;
					
				}
			}
			if(found == true) {
				return result;
			}else {
				return "Account not found.";
			}
			
		}else {
			return "Account not found.";
		}

	}

	public String getFormattedAcctInfo() {
		String info = "";
		if(accounts == null) {
			return null;
		}else {
			info += "ACCOUNT INFO FOR "+this.name+"\n";
			for(Account account:accounts) {
				info += account.toString();
			}
			return info;
		}
		
	}
	public double totalOfAllBalances() {
		double totalBalance = 0;
		for(Account account: accounts) {
			totalBalance += account.getBalance();
		}
		return totalBalance;
	}


}
