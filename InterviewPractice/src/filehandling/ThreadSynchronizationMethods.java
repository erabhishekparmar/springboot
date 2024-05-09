package filehandling;

public class ThreadSynchronizationMethods extends Thread {

	String message;
	Printer pw ;
	
	public ThreadSynchronizationMethods(String message, Printer pw)
	{
	this.message = message;	
	this.pw=pw;
	}
	
	@Override
	public void run() {
		
			pw.printMessage(message);
		
	}
	
	public static void main(String args[]) {
		
		Printer pw = new Printer();
		
		ThreadSynchronizationMethods th1 = new ThreadSynchronizationMethods("Hi",pw);

		ThreadSynchronizationMethods th2 = new ThreadSynchronizationMethods("Bye",pw);
		
		th1.start();
		
		th2.start();
		
		 
		
	}
	
}
