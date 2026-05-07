package Day7_Assessments;

class FoodDelivery extends Thread{
	public FoodDelivery(String name){
		setName(name);
	}
	
	public static synchronized void handleOrderStep(String stepName) {
		try {
			System.out.println(stepName + " started");
			Thread.sleep(3000);
			System.out.println(stepName + " completed");
		} catch (InterruptedException e) {
			System.out.println(stepName + " interrupted");
		}
	}

	public void run(){
		handleOrderStep(getName());
	}
}

public class Multi1 {

	public static void main(String[] args) throws InterruptedException {
		FoodDelivery order=new FoodDelivery("order Processing");
		FoodDelivery kitchen=new FoodDelivery("Preparing food");
		FoodDelivery delivery=new FoodDelivery("Delivering");

		order.setPriority(Thread.MAX_PRIORITY);
		kitchen.setPriority(Thread.NORM_PRIORITY);
		delivery.setPriority(Thread.MIN_PRIORITY);

		order.start();
		kitchen.start();
		delivery.start();
	}

}
