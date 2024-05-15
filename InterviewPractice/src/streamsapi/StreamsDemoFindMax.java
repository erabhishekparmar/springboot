package streamsapi;

import java.time.Year;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoFindMax {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(10,2,13,40,45,16,27);
		
		int max = list.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println("Max : "+max );
		
		int min = list.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println("Min : "+min );
		
		
		// collect stream as a linkedlist
		LinkedList<Integer> linkedList = list.stream().sorted().collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(linkedList);
		
	}
	
}
