package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfEmp {

	public static void main(String[] args) {
		
		Set<EmpSet> set = new HashSet<>();
		set.add(new EmpSet(25, "Raj", 25000));
		set.add(new EmpSet(35, "Amit", 67000));
		set.add(new EmpSet(22, "Satish", 50000));
		set.add(new EmpSet(23, "Bharat", 34000));
		set.add(new EmpSet(25, "Raj", 25000)); // duplicate
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		
		
		
	}
}
