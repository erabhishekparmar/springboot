package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOfEmp {

	public static void main(String[] args) {
		
		List<Emp> e = new ArrayList<>();
		
		e.add(new Emp(25, "Raj", 25000));
		e.add(new Emp(35, "Amit", 67000));
		e.add(new Emp(22, "Satish", 50000));
		e.add(new Emp(23, "Bharat", 34000));
		
		System.out.println(e);
		
		Collections.sort(e);
		
		System.out.println("____________After sorting ____________");
		
		System.out.println(e);
		
		
	}
	
}
