package Day9_Assessments;

class NumberPrinter{
	private int number = 1;
	
	public synchronized void printOdd() {
		while(number <= 100) {
			if(number % 2 == 0) {
				try {
					wait();
				} catch (Exception e) {}
			} else {
				System.out.println("Odd: " + number++);
				notify();
			}
		}
	}
	
	public synchronized void printEven() {
		while(number <= 100) { 
			if(number % 2 != 0) {
				try {
					wait();
				} catch (Exception e) {}
			} else {
				System.out.println("Even: " + number++);
				notify();
			}
		} 
	}
}

public class OddEven_Ex {

	public static void main(String[] args) {
		NumberPrinter n = new NumberPrinter();
		
		Thread t1 = new Thread(() -> n.printOdd());
		Thread t2 = new Thread(() -> n.printEven());
		
		t1.start();
		t2.start();
	}

}
