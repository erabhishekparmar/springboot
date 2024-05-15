package collections;

public class EmpSet  {

	private int age;
	private String name;
	private double salary;
	 
	@Override
	public int hashCode() {
		return this.getAge();
	}
	
	@Override
	public boolean equals(Object obj) {
		 
		EmpSet inputEmp = (EmpSet)obj;
		//return this.equals(inputEmp);
		
		return Integer.compare(this.age, inputEmp.age) == 0
				&& (this.name.equals(inputEmp.name)) 
				&& Double.compare(this.salary, inputEmp.salary) == 0;
		
	}
	public EmpSet(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
}
