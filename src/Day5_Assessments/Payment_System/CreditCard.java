package Day5_Assessments.Payment_System;

public class CreditCard implements PaymentMethod{
	private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Processing Credit Card payment using card ending " 
                           + cardNumber.substring(cardNumber.length() - 4));
    }

    public String getMethodName() {
        return "Credit Card";
    }
}
