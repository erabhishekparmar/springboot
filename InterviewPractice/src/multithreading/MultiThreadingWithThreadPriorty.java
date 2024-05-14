package multithreading;

public class MultiThreadingWithThreadPriorty extends Thread {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		
		try {
			for(int i= 0 ;i<10;i++) {
				System.out.println(name +" , "+i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		
		MultiThreadingWithThreadPriorty th1 = new MultiThreadingWithThreadPriorty();
		
		MultiThreadingWithThreadPriorty th2 = new MultiThreadingWithThreadPriorty();
		
		System.out.println("Thread name : " + th1.getName()+"Thread Priority : "+th1.getPriority());
 
		System.out.println("Thread name : " + th2.getName()+"Thread Priority : "+th2.getPriority());
		
		th1.setPriority(MAX_PRIORITY);
		
		System.out.println("Thread name : " + th1.getName()+"Thread Priority : "+th1.getPriority());
		 
		System.out.println("Thread name : " + th2.getName()+"Thread Priority : "+th2.getPriority());
				
		th1.start();
		
		th2.start();
		
	}
	
}
