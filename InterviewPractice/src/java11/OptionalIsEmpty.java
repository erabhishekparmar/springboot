package java11;

import java.util.Optional;

public class OptionalIsEmpty {
	public static void main(String[] args) {

		Optional<String> name1 = Optional.of("Abhishek");
		Optional<String> name2 = Optional.empty();

		System.out.println("name1.isPresent(): " + name1.isPresent()); // true
		System.out.println("name1.isEmpty(): " + name1.isEmpty()); // false

		System.out.println("name2.isPresent(): " + name2.isPresent()); // false
		System.out.println("name2.isEmpty(): " + name2.isEmpty()); // true
	}
}