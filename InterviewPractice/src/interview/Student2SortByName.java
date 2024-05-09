package interview;

import java.util.Comparator;

public class Student2SortByName implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.getName().compareTo(o2.getName());
	}

	
	
}
