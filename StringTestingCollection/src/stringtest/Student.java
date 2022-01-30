package stringtest;

public class Student {
	protected String  name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
