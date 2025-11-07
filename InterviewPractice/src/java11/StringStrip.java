package java11;

public class StringStrip {

	public static void main(String[] args) {
	
		String LeadingSpaceName = "    Hello"; 
		
		String TrailingSpaceName = "Hello     "; 
		
		String LeadingTrailingSpaceName = "    Hello    "; 
		
		System.out.println("After stripLeading "+LeadingSpaceName.stripLeading()); 
		
		System.out.println("After stripTrailing "+TrailingSpaceName.stripTrailing());
		
		System.out.println("After strip "+LeadingTrailingSpaceName.strip());

	}
}
