package abstraction;

public class Main {
	public static void main(String args[]) {
		Language language = new Hindi();
		language.greetings(); //Hindi Namaste!
		
		language = new English();
		language.greetings(); //English hello!
	}
}
