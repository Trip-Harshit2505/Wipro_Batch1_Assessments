package Day9_Assessments;

class Bank {
	private double balance = 1000;
	
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " Deposited: " + amount + " Balance: " + balance);
	}
	
	public synchronized void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " Withdraw: " + amount + " Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
}

public class BankSystem {

	public static void main(String[] args) {
		Bank acc = new Bank();
		
		Runnable task = () -> {
			acc.deposit(500);
			acc.withdraw(300);
		};
		
		Thread t1 = new Thread(task, "User1");
		Thread t2 = new Thread(task, "User2");
		
		t1.start();
		t2.start();
	}

}
