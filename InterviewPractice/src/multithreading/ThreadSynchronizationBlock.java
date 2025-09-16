package multithreading;

public class ThreadSynchronizationBlock extends Thread {

	String message;
	Printer pw ;
	
	public ThreadSynchronizationBlock(String message, Printer pw)
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
		
		ThreadSynchronizationBlock th1 = new ThreadSynchronizationBlock("Hi",pw);

		ThreadSynchronizationBlock th2 = new ThreadSynchronizationBlock("Bye",pw);
		
		th1.start();
		
		th2.start();
		
		 
		
	}
	
}
