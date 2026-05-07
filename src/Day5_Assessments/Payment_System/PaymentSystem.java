package Day5_Assessments.Payment_System;
import java.util.Scanner;

public class PaymentSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Lambda function
        Payment paymentTxn = (method, amount) -> {
            System.out.println("\n**** Paying via " + method.getMethodName() + " ****");
            method.pay(amount);
            method.paymentSuccess(amount);
        };

        System.out.println("=== Payment System ===");
        System.out.println("1. Pay via UPI");
        System.out.println("2. Pay via Credit Card");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); //newline

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        PaymentMethod method = null;

        switch (choice) {
            case 1:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                method = new UPI(upiId);
                break;

            case 2:
                System.out.print("Enter Card Number: ");
                String cardNumber = sc.nextLine();
                method = new CreditCard(cardNumber);
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        paymentTxn.pay(method, amount);

        sc.close();
	}
	
}
