package Day5_Assessments.Banking_System;

public class SavingsAccount implements BankAccount{
	private double balance;
	
	public SavingsAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited amount: " + amount);
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn amount: " + amount);
		}
		else {
			System.out.println("Insufficient balance!!!");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountType() {
		return "Savings Account";
	}
	
}
