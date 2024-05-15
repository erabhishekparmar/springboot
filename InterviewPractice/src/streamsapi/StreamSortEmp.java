package streamsapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortEmp {
	
	public static void main(String[] args) {
		
		EmpSortByName empSortByName = new EmpSortByName();
		
		List <Emp> list = new ArrayList<>();
		list.add(new Emp("Abhishek","Pune"));
		list.add(new Emp("Manoj","UP"));
		list.add(new Emp("Prashant","Surat"));
		list.add(new Emp("Ajay","Pune"));
		
		System.out.println(list);
		
		List<Emp> sortedEmps = list.stream().sorted(empSortByName).collect(Collectors.toList());
		
		System.out.println("Sorted by Name....");
		System.out.println(sortedEmps);
		
		
		// other way 
		Comparator <Emp> byCityComparator = Comparator.comparing(Emp::getCity);
		
		List<Emp> sortedEmpByCity = list.stream().sorted(byCityComparator).collect(Collectors.toList());
		
		System.out.println("Sorted by City....");
		
		System.out.println(sortedEmpByCity);
		
	}
}
