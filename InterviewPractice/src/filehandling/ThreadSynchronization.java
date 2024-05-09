package filehandling;

public class ThreadSynchronization extends Thread {

	String message;
	Printer pw ;
	
	public ThreadSynchronization(String message, Printer pw)
	{
	this.message = message;	
	this.pw=pw;
	}
	
	@Override
	public void run() {
		
		 synchronized(pw) {
			pw.printMessage(message);
		 }
		
	}
	
	public static void main(String args[]) {
		
		Printer pw = new Printer();
		
		ThreadSynchronization th1 = new ThreadSynchronization("Hi",pw);

		ThreadSynchronization th2 = new ThreadSynchronization("Bye",pw);
		
		th1.start();
		
		th2.start();
		
		 
		
	}
	
}
