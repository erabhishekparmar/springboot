package java11;

public class StringisBlank {

	public static void main(String[] args) {
		
		String name = "    "; // this string is blank as it has spaces only
		String userString = "abhisehk";
		System.out.println("name is blank ? : "+name.isBlank()); // true
		System.out.println("name is blank ? : "+userString.isBlank());// false
		
	}
	
}
