package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(10,2,13,40,45,16,27);
		
		System.out.println("Even Elements : ");
		
		list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		System.out.println("______________________");
		
		System.out.println("Squared List : ");
		
		list.stream().map(n->n*n).sorted().forEach(n->System.out.print(n+" "));
		
		System.out.println("______________________");
		
		// method references ::
		list.stream().map(n->n*n).sorted().forEach(System.out::print);
		
		System.out.println();
		 
		// multiply by 10
		List <Integer> result = list.stream().map(n->n*10).collect(Collectors.toList());

		for(Integer x : result)
		{
			System.out.print(x+" ");
		}
		
		
	}
	
}
