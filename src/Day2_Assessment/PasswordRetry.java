package Day2_Assessment;

import java.util.*;

public class PasswordRetry {
	
	static String correctPassword = "admin123";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access Granted!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong password. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Access Denied!");
        }

        sc.close();
	}
}
