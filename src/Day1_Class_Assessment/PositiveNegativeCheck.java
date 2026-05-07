// Q) Check whether a number is positive or negative 

package Day1_Class_Assessment;

import java.util.Scanner;

public class PositiveNegativeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
		sc.close();
	}

}
