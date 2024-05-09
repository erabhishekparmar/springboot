package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableDemo {

	public static void main(String[] args) {
		
		Student s2 = new Student (3,"raj",25);
		Student s1 = new Student (1,"abhishek",22);
		Student s3 = new Student (2,"satish",27);
		
		List<Student> list = new ArrayList<>();
		
		list.add(s2);
		list.add(s1);
		list.add(s3);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
	
}
