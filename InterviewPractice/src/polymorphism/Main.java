package polymorphism;

public class Main {
	
	public static void main(String args[]) {
		Parent parent = new Child();
		
		parent.show(); // calls the show of Child bcz object is of child and show is non-static
		
		parent.hide(); // calls the show of Parent bcz reference is of Parent and hide is static
		
		 
	}
}
