package Day2_Assessment;

public class ATM_System {
	
	static int balance = 12000;
	
	public static void main(String[] args) {
		int amount = 14000;
		if(balance >= amount) {
			System.out.println("You can collect the cash");
		}else {
			System.out.println("Insufficient balance");
		}
	}

}
