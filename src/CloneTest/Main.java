package CloneTest;

public class Main {
	public static void main(String[] strings) {
		Teacher emp = new Teacher();
		emp.setName("aaa");

		Teacher[] emps = new Teacher[2];
		
		emps[0] = emp;
		
		try {
			emps[1] = (Teacher)emp.clone();
			emps[1].setName("bbb");
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		for(Teacher e:emps) {
			System.out.println(e.getName());
		}
	}
	
	
}
