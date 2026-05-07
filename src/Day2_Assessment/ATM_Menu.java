package Day2_Assessment;

import java.util.Scanner;

public class ATM_Menu {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Balance: ₹1000");
	                    break;
	                case 2:
	                    System.out.println("Deposit successful!");
	                    break;
	                case 3:
	                    System.out.println("Withdrawal successful!");
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 4);

	        sc.close();

	}

}
