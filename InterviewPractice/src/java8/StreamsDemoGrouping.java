package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemoGrouping {

	public static void main(String[] args) {
		
		List <Emp> list = new ArrayList<>();
		list.add(new Emp("Abhishek","Pune"));
		list.add(new Emp("Yash","UP"));
		list.add(new Emp("Prashant","Surat"));
		
		Stream<Emp> empList = list.stream();
		
		Map<String,List<Emp>> newList =  empList.collect(Collectors.groupingBy(Emp::getCity));
		
		System.out.println(newList);
		
		//list.stream().filter(n->n.getCity().startsWith("P")).forEach(System.out::print);
		
		
		
	}
	
}
