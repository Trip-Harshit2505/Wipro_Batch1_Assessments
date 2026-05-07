package Day5_Assessments;

final class SecurityModule{
	
	public void encrypt() {
		System.out.println("Some random encryption");
	}
}

class Hacker extends SecurityModule{
}

public class Security_Test {

	public static void main(String[] args) {
		SecurityModule s = new SecurityModule();
        s.encrypt();
	}

}
