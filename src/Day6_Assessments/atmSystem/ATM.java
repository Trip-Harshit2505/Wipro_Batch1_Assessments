package Day6_Assessments.atmSystem;

public class ATM {
	private final int correctPIN = 2233;
	
	public void insertCard() {
		System.out.println("Card Inserted Sucessfully");
	}
	
	public void enterPIN(int pin) throws InvalidPinException {
		if(pin != correctPIN) {
			throw new InvalidPinException("INAVLID PIN");
		}
		System.out.println("Pin Successfully Verified");
	}
}
