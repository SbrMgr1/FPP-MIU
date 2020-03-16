class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;// holds account type
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance +=deposit;// new added
	}

	public boolean makeWithdrawal(double amount) {
		//added new
		if(this.balance < balance) {
			return false;
		}else {
			this.balance -= amount;
			return true;
		}
		
	}
	public AccountType getAcctType() {
		return acctType;
	}
	
	public double computeInterest() {
		if(this.acctType == AccountType.CHECKING) {
			return balance*0.02;
		}else if(this.acctType == AccountType.SAVINGS) {
			return balance*0.04;
		}else if(this.acctType == AccountType.RETIREMENT) {
			return balance*0.05;
		}else {// no type is specified
			return 0.00f;
		}
	}
}
