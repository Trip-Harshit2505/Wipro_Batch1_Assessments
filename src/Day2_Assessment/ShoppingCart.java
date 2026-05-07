package Day2_Assessment;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double total = 0;
        double price;

        do {
            System.out.print("Enter item price (0 to stop): ");
            price = sc.nextDouble();
            total += price;
        } while (price != 0);

        System.out.println("Total amount: " + total);

        sc.close();
	}
}
