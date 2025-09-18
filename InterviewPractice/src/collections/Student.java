package collections;

public class Student {
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	int age;
	String name;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
