package Day2_Assessment;

public class Validation_System {
	
	static String user = "harshit@123";
	static String pass = "password123";
	
	public static void main(String[] args) {
		String username = "harshit@1234";
		String password = "password123";
		
		if(username == user && password == pass) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
	}
	
}
