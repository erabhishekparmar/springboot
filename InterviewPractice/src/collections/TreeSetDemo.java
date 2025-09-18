package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Book b1 = new Book("First Step", "Abhishek", 400);
		Book b2 = new Book("Let's C", "Shreekant", 300);
		Book b3 = new Book("Alchemist", "John", 350);
		Book b4 = new Book("Alchemist", "John", 350);

		TreeSet <Book> set = new TreeSet<>();
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		System.out.println(set.size());
		
		System.out.println();
		
		System.out.println(set);
		
		Iterator<Book> iterator = set.iterator();
		
		System.out.println("Treeset using Iterator:");
		while(iterator.hasNext()) {
			Book book= iterator.next();
			System.out.println(book);
		}
		
		//TreeSet → does not use hashCode() / equals() for ordering or duplicates.

		//Instead, it uses compareTo() (if the object implements Comparable
		
	}
	
}
