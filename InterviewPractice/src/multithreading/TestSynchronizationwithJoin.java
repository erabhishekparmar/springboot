package multithreading;

public class TestSynchronizationwithJoin {
	public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) 
            	c.increment();
        });

        t1.start();
        t2.start();

        t1.join();  // wait for t1
        t2.join();  // wait for t2

        System.out.println("Final count: " + c.count);
    }
}
