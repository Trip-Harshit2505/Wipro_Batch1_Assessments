package Day3_Assessment;

class Amount{
	private double balance;
	
	public void set(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		double total_amount = this.balance+amount;
		System.out.println("Balance: " + total_amount);
	}
	
	public void withdrawal(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			double remaining_balance = this.balance - amount;
			System.out.println("Balance: " + remaining_balance);
		}
	}
}

public class BankEx {

	public static void main(String[] args) {
		Amount a = new Amount();
//		a.set(12370.35);
		a.deposit(1250);
		a.withdrawal(1500.35);
	}

}
