package multithreading;

public class ThreadSynchronizationMethods extends Thread {

	String message;
	Printer_1 pw ;
	
	public ThreadSynchronizationMethods(String message, Printer_1 pw)
	{
	this.message = message;	
	this.pw=pw;
	}
	
	@Override
	public void run() {
		
			pw.printMessage(message);
		
	}
	
	public static void main(String args[]) {
		
		Printer_1 pw = new Printer_1();
		
		ThreadSynchronizationMethods th1 = new ThreadSynchronizationMethods("Hi",pw);

		ThreadSynchronizationMethods th2 = new ThreadSynchronizationMethods("Bye",pw);
		
		th1.start();
		
		th2.start();
		
		 
		
	}
	
}
