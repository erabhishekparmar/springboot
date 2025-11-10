package java17;

import java.util.random.RandomGenerator;

public class RandomGeneratorExample {
	public static void main(String[] args) {

		// Create a default random generator (L64X128MixRandom by default)
		RandomGenerator random = RandomGenerator.getDefault();

		System.out.println("Random int: " + random.nextInt());
		System.out.println("Random int upto 100: " + random.nextInt(100));
		System.out.println("Random double: " + random.nextDouble());
		System.out.println("Random boolean: " + random.nextBoolean());
	}
}
