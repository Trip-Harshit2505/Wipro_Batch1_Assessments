package Day12_Assessments;
import java.io.*;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			User u2 = (User) ois.readObject();
			
			ois.close();
			fis.close();
			
			u2.display();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
