package java11;

import java.util.stream.Stream;

public class Stringlines {

	public static void main(String[] args) {
	
		String name = "This is first line.\nThis is second line\n."; 
		Stream<String> listOfLineStream = name.lines();
		listOfLineStream.forEach(str->System.out.println(str));
		
	}
	
}
