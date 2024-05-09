package accenture;

import java.util.ArrayList;
import java.util.List;

public class EmpWithVowel {
	
	public static boolean checkVowel(String name) {
	
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='u')
				return true;
		}
		
		return false;
	}
	
	public static Emp getEmpWithVowel(List<Emp> list) {
		
		for(Emp e : list) {
			String name = e.name;
			
			// call check vowel
			boolean flag = checkVowel(name);
			
			if(flag)
				return e;
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1,"Suraj");
		Emp e2 = new Emp(2,"Kamal");
		Emp e3 = new Emp(3,"Abhishek");
		
		
		// get emp from list of emp with vowel u in it
		
		List<Emp> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Emp result = getEmpWithVowel(list);
		
		System.out.println(result);
		
	}

	
	
}
