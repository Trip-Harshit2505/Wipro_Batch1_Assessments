package Day5_Assessments.Banking_System;

public class CurrentAccount implements BankAccount {
	
	private double balance;
	private double limit = 1000;
	
	public CurrentAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited amount: " + amount);
	}
	
	public void withdraw(double amount) {
		if(balance - amount >= limit) {
			balance = balance - amount;
			System.out.println("Withdrawn amount: " + amount);
		}
		else {
			System.out.println("limit exceeded!!!");
		}
	}
	
	public String getAccountType() {
		return "Current Account";
	}
	
	public double getBalance() {
		return balance;
	}
	
}
