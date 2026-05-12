package Day5_Assessments;

interface PaymentService {
	void processPayment(double amount);
}

class PaymentImpl implements PaymentService {

	public void processPayment(double amount) {

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }

            System.out.println("Processing payment of ₹" + amount);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Transaction attempt logged.");
        }
    }
}

public class PaymentTest {
    public static void main(String[] args) {

        PaymentService payment = new PaymentImpl();

        payment.processPayment(500);
        payment.processPayment(-100); 
    }
}