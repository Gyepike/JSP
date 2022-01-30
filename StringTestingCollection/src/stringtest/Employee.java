package stringtest;

public class Employee {
	protected String  name;

	public Employee(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
