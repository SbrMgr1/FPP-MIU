
import java.util.Date;
import java.util.GregorianCalendar;

//same as the Employee class defined in the lecture
class Employee {
	
	//instance fields
		private String name;
		private double salary;
		private GregorianCalendar hireDay;
//constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = new GregorianCalendar(aYear, aMonth - 1, aDay);
	}

// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

//needs to be improved!!
	public GregorianCalendar getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public double yearlyFederalTax(double salary) {
	
		if(salary > 80000) {
			return 28.00f;
		}else if(salary <= 80000 && salary > 50000 ){
			return 24.00f;
		}else if(salary <= 50000 && salary > 26000   ){
			return 20.00f;
		}else {
			return 0.00f;
		}
	}


}
