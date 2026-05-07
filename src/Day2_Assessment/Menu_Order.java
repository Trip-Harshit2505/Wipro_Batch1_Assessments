package Day2_Assessment;

public class Menu_Order {

	public static void main(String[] args) {
		int order = 22;
		switch (order) {
		case 1: {
			System.out.println("Maggie");
			break;
		}
		case 2: {
			System.out.println("White Sauce Pasta");
			break;
		}
		case 3: {
			System.out.println("Red Sauce Pasta");
			break;
		}
		case 4: {
			System.out.println("Sandwich");
		}
		case 5: {
			System.out.println("Cold Coffee");
			break;
		}
		case 6: {
			System.out.println("Tea");
		}
		default:
			System.out.println("Unexpected value: " + order);
			break;
		}
	}

}
