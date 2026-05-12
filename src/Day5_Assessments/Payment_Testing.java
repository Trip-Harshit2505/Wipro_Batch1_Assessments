package Day5_Assessments;

class Payment{
	public final void processPayment() { 
		System.out.println("Payment is processing");
	}
}

class UPI extends Payment{

	// uncomment for test
//    public void processPayment() {
//        System.out.println("UPI Payment");
//    }
	
	 public void show() {
	        System.out.println("UPI Method");
	    }
}

public class Payment_Testing {

	public static void main(String[] args) {
		UPI u = new UPI();
		u.processPayment();
		u.show();
	}

}
