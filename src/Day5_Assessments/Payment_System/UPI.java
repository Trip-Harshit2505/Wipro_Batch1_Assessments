package Day5_Assessments.Payment_System;

public class UPI implements PaymentMethod{
	private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Processing UPI payment via " + upiId);
    }

    public String getMethodName() {
        return "UPI";
    }
}
