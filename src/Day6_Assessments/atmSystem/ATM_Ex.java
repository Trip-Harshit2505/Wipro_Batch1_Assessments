package Day6_Assessments.atmSystem;

import java.util.Scanner;

public class ATM_Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		
		try {
			atm.insertCard();
			
			System.out.println("Enter your pin: ");
			int pin = sc.nextInt();
			
			atm.enterPIN(pin);
			
			System.out.println("Access Granted!!!");
		} catch (InvalidPinException e){
			System.out.println("Exception: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		} finally {
			System.out.println("\nYou can remove your card");
			sc.close();
		}
	}

}
