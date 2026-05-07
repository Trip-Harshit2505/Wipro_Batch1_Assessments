package Day12_Assessments.BankingApp;
import java.io.*;

class Account {
	private int accNo;
	private String name;
	private double balance;
	public String path = "src/Day12_Assessments/BankingApp";
	
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void logTransaction(String message) throws IOException {
		FileWriter fw = new FileWriter(path + "/transaction.txt", true);
		fw.write("accNo: " + accNo + " | " + message + "\n");
		fw.close();
	}
	
	public void deposit(double amount) throws IOException{
		balance += amount;
		logTransaction("Deposited: " + amount);
	}
	
	public void withdraw(double amount) throws IOException{
		if(balance >= amount) {
			balance -= amount;
			logTransaction("Withrawn: " + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
}

public class BankingApp {

	public static void main(String[] args) throws IOException {
		Account acc = new Account(102, "Harshit", 5000);
		
		acc.deposit(500);
		acc.withdraw(5000);
		acc.showBalance();
		
		try(BufferedReader br = new BufferedReader(new FileReader(acc.path + "/transaction.txt")))
		{
			String line;
			
			System.out.println("\n*****Transaction History*****");
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}

	}

}
