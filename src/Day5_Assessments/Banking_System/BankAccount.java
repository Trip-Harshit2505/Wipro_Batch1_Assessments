package Day5_Assessments.Banking_System;

interface Transaction{
	void execute(BankAccount acc,double amount);
}

public interface BankAccount {
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
	String getAccountType();
	
	default void checkBalance() {
		System.out.println("Current Balance: " + getBalance());
	}
}
