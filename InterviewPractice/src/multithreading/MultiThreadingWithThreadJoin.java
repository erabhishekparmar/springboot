package multithreading;

public class MultiThreadingWithThreadJoin extends Thread {

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
		
		MultiThreadingWithThreadJoin th = new MultiThreadingWithThreadJoin();
		
		MultiThreadingWithThreadJoin th1 = new MultiThreadingWithThreadJoin();

		try {
			th.start();
			th.join(); // main waits until th finishes
		} 
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	
		try {
			th1.start();
			th1.join(); // main waits until th1 finishes
		} 
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		
	}
	
}
