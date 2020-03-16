
public class RetirementAccount {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	RetirementAccount(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	RetirementAccount(Employee emp) {
		this(emp,DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = retirement , balance = " + balance;
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
	public String getAcctType() {
		return "retirement";// change
	}
	public double computeInterest() {
		return balance*0.05;// change
	}
}
