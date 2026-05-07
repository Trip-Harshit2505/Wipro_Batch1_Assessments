package Day2_Assessment;

import java.util.Scanner;

public class Salary_Increment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
        }

        System.out.print("Enter increment percentage: ");
        double increment = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            salary[i] += salary[i] * increment / 100;
        }

        System.out.println("Updated Salaries:");
        for (double s : salary) {
            System.out.println(s);
        }
        
        sc.close();
	}

}
