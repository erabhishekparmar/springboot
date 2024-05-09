package filehandling;

import java.io.Serializable;

public class Demo implements Serializable{

	transient int a;
	static int b;
	String firstname;
	String lastname;
 
	public Demo( String firstname, String lastname, int a,int b ) {
		 
		this.a = a;
		Demo.b=b;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	 

	@Override
	public String toString() {
		return "Demo [firstname=" + firstname + ", lastname=" + lastname +", a= " + a + ", b= " + b +"]";
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
		Demo.b = b;
	}

	 
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
