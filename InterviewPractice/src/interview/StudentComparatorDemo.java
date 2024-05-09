package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorDemo {

	public static void main(String[] args) {
		
		Student2 s2 = new Student2 (3,"raj",25);
		Student2 s1 = new Student2 (1,"abhishek",22);
		Student2 s3 = new Student2 (2,"satish",27);
		
		List<Student2> list = new ArrayList<>();
		
		list.add(s2);
		list.add(s1);
		list.add(s3);
		
		System.out.println(list);
		
		
		Student2SortByID sortID = new Student2SortByID();
		Collections.sort(list,sortID);
		System.out.println(list);
		
		
		Student2SortByName sortName = new Student2SortByName();
		Collections.sort(list,sortName);
		System.out.println(list);
		
		
	}
	
}
