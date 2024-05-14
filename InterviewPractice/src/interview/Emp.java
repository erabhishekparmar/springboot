package interview;

import java.io.Serializable;

public class Emp implements Serializable {
	
	int empNo;
	String empFirstName;
	String empLastName;
	
	transient int a;
	static int b;
	
 
	public Emp(int empNo, String empFirstName, String empLastName) {
		super();
		this.empNo = empNo;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", a=" + a
				+ ", b=" + b+ "]";
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Emp.b = b;
	}
	
	

}
