import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Day4AssEmployerMain {
	public static void main(String[] strings){
		Employee employee = new Employee("Samsher",80000f, 2020, 12, 5);
		Account[] accounts = {
				new Account(employee, AccountType.CHECKING,300),
				new Account(employee, AccountType.SAVINGS,300),
				new Account(employee, AccountType.RETIREMENT,300),
		};
		
		ArrayList<String> string = new ArrayList<String>();
		for(Account account:accounts) {
			string.add(account.toString());
		}
		System.out.println("Account Types are:"+Arrays.toString(string.toArray()));
//		practice();
		
	}
	
	public static void practice() {
		Employee[] employees = {
				new Employee("Samsher",80000f, 2020, 12, 5),
				new Employee("Nabin",80000f, 2020, 11, 1),
				new Employee("Biswas",80000f, 2020, 11, 18)
		};
		
		Account[] accounts = {
				new Account(employees[0], AccountType.CHECKING,300),
				new Account(employees[0], AccountType.SAVINGS,300),
				new Account(employees[0], AccountType.RETIREMENT,300),
		};
		
		ArrayList<String> taxStr = new ArrayList<String>();
		ArrayList<String> HireDay = new ArrayList<String>();
		
		for(Employee employee:employees) {
			taxStr.add(String.format("%.2f%%", employee.yearlyFederalTax(employee.getSalary())));
			HireDay.add(new SimpleDateFormat("MM/dd/yyyy").format(employee.getHireDay().getTime()));
		}		
		System.out.println("taxes are:"+Arrays.toString(taxStr.toArray()));
		System.out.println("taxes are:"+Arrays.toString(HireDay.toArray()));
		
		ArrayList<String> string = new ArrayList<String>();
		for(Account account:accounts) {
			string.add(account.toString());
		}
		System.out.println("Account Types are:"+Arrays.toString(string.toArray()));
	}
}
