package Day7_Assessments;

class Order implements Runnable{
	public void run() {
		try {
				
			System.out.println(Thread.currentThread().getName() + " is processing the Order");
			Thread.sleep(0);
			System.out.println(Thread.currentThread().getName() + " completed the Order");
		} catch(InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}

class Payment implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is processing the Payment");
	}
}

class Notification implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is sending the Notification");
	}
}

public class MultiThreadEx {

	public static void main(String[] args) throws InterruptedException {
		Order o = new Order();
		Payment p = new Payment();
		Notification n = new Notification();
		
		Thread t1 = new Thread(o);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(n);
        
        t1.setName("Order Thread");
        t2.setName("Payment Thread");
        t3.setName("Notification Thread");
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        
        System.out.println(t1.getName() + " alive status: " + t1.isAlive());
        System.out.println(t2.getName() + " alive status: " + t2.isAlive());
        System.out.println(t3.getName() + " alive status: " + t3.isAlive());
        
        t1.join();
        t2.join();
        
        t3.start();
        t3.join();
        
        System.out.println("\nCompleted!!!");
	}

}
