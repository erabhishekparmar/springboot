package multithreading;

public class MultiThreadingWithRunnable implements Runnable {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		
		try {
			for(int i= 0 ;i<10;i++) {
				System.out.println(name + ","+i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		
		MultiThreadingWithRunnable runnable = new MultiThreadingWithRunnable();
		
		Thread th = new Thread(runnable);
		
		System.out.println("Thread name : " + th.getName());
				
		th.start();
		
		String name = Thread.currentThread().getName();
		
		try {
			for(int i= 0 ;i<10;i++) {
				System.out.println(name + ","+i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
