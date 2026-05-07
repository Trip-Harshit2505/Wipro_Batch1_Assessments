package Day12_Assessments;
import java.io.*;

class User implements Serializable{
	private int id;
	private String username;
	transient String password;
	
	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	void display() {
        System.out.println(id + " " + username + " " + password);
    }
	
}

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		try {
			User u1 = new User(101, "ht@123", "mypassword");
			
			FileOutputStream fos = new FileOutputStream("user.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(u1);
			oos.close();
			fos.close();
			
			System.out.println("Serialized Successfully");
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
