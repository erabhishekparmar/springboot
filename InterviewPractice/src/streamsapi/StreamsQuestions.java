package streamsapi;

import java.util.stream.Stream;

public class StreamsQuestions {

	public static void main(String[] args) {
		
		String []names= {"Abhishek","Raj","Anil","Ravi","Pawan"};
		
		Stream<String> stream = Stream.of(names);
		
		System.out.println(names);
		
		// filter names starting with A
		stream.filter(s->s.startsWith("A")).forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> stream1 = Stream.of(names);
		
		// filter names ending with k
		stream1.filter(s->s.endsWith("k")).forEach(System.out::print);
		
		// empty stream
		
		Stream <Object> emptyStream = Stream.empty();
		
		System.out.println(emptyStream);
		
		
		
	}
	
}
