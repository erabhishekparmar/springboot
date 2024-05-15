package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(10,2,13,40,45,16,27);
		
		System.out.println("Unsorted List : "+list);
		
		// sort list 
		List <Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List : "+sortedList);
		
		// filter even elements
		sortedList.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		
		List <Integer> numbers = Arrays.asList(1000,200,49,50,330,160,27);
		
		// find numbers greater than 50 
		List <Integer> gT50 = numbers.stream().filter(n->n>50).collect(Collectors.toList());
		
		System.out.println("Numbers greator than 50 "+gT50);
		
		
		
	}
	
}
