package Day5_Assessments.Payment_System;

interface Payment {
    void pay(PaymentMethod method, double amount);
}

public interface PaymentMethod {
	void pay(double amount);

    default void paymentSuccess(double amount) {
        System.out.println("Payment of ₹" + amount + " successful!");
    }

    String getMethodName();
}
