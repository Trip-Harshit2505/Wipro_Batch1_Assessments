package Day5_Assessments.Banking_System;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankAccount savings = new SavingsAccount(5000);
		BankAccount current = new CurrentAccount(2000);
		
		Transaction depositTxn = (acc, amt) -> {
			System.out.println("\n****Deposit(" + acc.getAccountType() + ")****");
			acc.deposit(amt);
		};
		
		Transaction withdrawTxn = (acc, amt) -> {
			System.out.println("\n****Withdraw(" + acc.getAccountType() + ")****");
			acc.withdraw(amt);
		};
		
		//Savings Account
		depositTxn.execute(savings, 1000);
		withdrawTxn.execute(savings, 2500);
		
		//Current Account
		depositTxn.execute(current, 1000);
		withdrawTxn.execute(current, 2500);
		
		System.out.println("\nSavings Account:");
        savings.checkBalance();
        
        System.out.println("\nCurrent Account:");
        current.checkBalance();
		
	}

}
