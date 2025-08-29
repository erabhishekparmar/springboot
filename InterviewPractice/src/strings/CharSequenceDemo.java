package strings;

public class CharSequenceDemo {
	
	public static void printChars(CharSequence seq) {
	    for (int i = 0; i < seq.length(); i++) {
	        System.out.print(seq.charAt(i) + " ");
	    }
	}
	
	public static void main(String[] args) {
	printChars("Hello");                 // String
	printChars(new StringBuilder("Hi")); // StringBuilder
	printChars(new StringBuffer("Hey")); // StringBuffer
	}
	
	// subSequence return CharSequence 
	// CharSequence provides a common type for working with sequences of characters, without forcing you to use a specific implementation like String.
	// we can store String, StringBuffer, StringBuilder in CharSequence

}
