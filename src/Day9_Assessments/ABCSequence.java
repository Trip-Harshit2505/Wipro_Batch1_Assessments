package Day9_Assessments;

class ABCPrinter{
	private int state = 1;
	
	public synchronized void printA() {
		while(true) {
			if(state % 3 != 1) {
				try { wait(); } catch(Exception e) {}
			} else {
				System.out.print("A");
				state++;
				notifyAll();
			}
		}
	}
	
	public synchronized void printB() {
		while(true) {
			if(state % 3 != 2) {
				try { wait(); } catch(Exception e) {}
			} else {
				System.out.print("B");
				state++;
				notifyAll();
			}
		}
	}
	
	public synchronized void printC() {
		while(true) {
			if(state % 3 != 0) {
				try { wait(); } catch(Exception e) {}
			} else {
				System.out.print("C");
				state++;
				notifyAll();
			}
		}
	}
}

public class ABCSequence {

	public static void main(String[] args) {
		ABCPrinter x = new ABCPrinter();
		
		Thread t1 = new Thread(() -> x.printA());
		Thread t2 = new Thread(() -> x.printB());
		Thread t3 = new Thread(() -> x.printC());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
