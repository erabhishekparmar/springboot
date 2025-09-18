package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSortingWithComparator {

	public static void main(String[] args) {
		
		List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student(22,"Raja"));
		listOfStudents.add(new Student(28,"Kunali"));
		listOfStudents.add(new Student(25,"Jyoti"));
		listOfStudents.add(new Student(21,"Abhishek"));
		
		System.out.println("List of Students: "+listOfStudents);
		
		Collections.sort(listOfStudents,new StudentNameSort());
		
		System.out.println("Sorted List of Students: "+listOfStudents);
	}

}
