package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(40);

		System.out.println("List is Empty : " + list.isEmpty());

		System.out.println("List : " + list);

		System.out.println("List zero index value : " + list.indexOf(10));

		System.out.println("List Contains 20 ?: " + list.contains(20));

		list.remove(Integer.valueOf(20));

		System.out.println("List Contains 20 ?: " + list.contains(20));

		System.out.println("List : " + list);

		list.add(2, 25);

		System.out.println("List : " + list);

		Collections.sort(list);

		System.out.println("Sorted List : " + list);

		List<Integer> list2 = Arrays.asList(10, 30, 25, 40, 50); // order is different than list

		System.out.println("List 1 equals List 2 ?: " + list.equals(list2)); // false

		System.out.println("List 1 contains List 2 ?: " + list.containsAll(list2));

		list.forEach(n -> System.out.println(n));

	}
}
