package filehandling;

public class Printer_1 {

	public Printer_1( ) {
		
	}
	
	public synchronized void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
