package Day2_Assessment;

public class Discount_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchase_amount = 9000;
		
		if(purchase_amount >= 10000) {
			System.out.println("You will get 10% discount");
		}else if(purchase_amount >= 15000) {
			System.out.println("You will get 15% discount");
		}
		else {
			System.out.println("No discount for your purchase");
		}
	}

}
