package filehandling;

public class MultiThreadingWithThread extends Thread {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		
		try {
			for(int i= 0 ;i<10;i++) {
				System.out.println(name + i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		
		MultiThreadingWithThread th = new MultiThreadingWithThread();
		
		System.out.println("Thread name : " + th.getName());
				
		th.start();
		
		String name = Thread.currentThread().getName();
		
		try {
			for(int i= 0 ;i<10;i++) {
				System.out.println(name +i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
