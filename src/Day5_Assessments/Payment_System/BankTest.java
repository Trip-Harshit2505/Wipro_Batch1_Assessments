package Day5_Assessments.Payment_System;

abstract class Bank {
	abstract double getInterestRate();
}

class SBI extends Bank {
	double getInterestRate() {
		return 6.25;
	}
}

class HDFC extends Bank {
	double getInterestRate() {
		return 5.20;
	}
}

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		
		System.out.println("SBI Interest Rate: " + b1.getInterestRate());
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate());

	}

}
