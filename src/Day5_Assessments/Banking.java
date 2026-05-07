package Day5_Assessments;


class BankAccount{
	final int accountNumber;
	private String name;
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("#### DETAILS ####");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + name);
	}
}

public class Banking {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(123, "Modi");
		b.displayInfo();
		
		b.accountNumber = 789;
	}

}
