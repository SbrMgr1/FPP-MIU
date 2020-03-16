package CloneTest;

public class Teacher extends Staff implements Cloneable {

	public Teacher() {
		System.out.println("constructor");
	}

	public Object clone() throws CloneNotSupportedException{
		try {
			Teacher copy = (Teacher) super.clone();
			return copy;
		} catch (Exception e) {
			throw new CloneNotSupportedException(e.getMessage());
		}

	}

}
