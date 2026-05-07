package Day11_Assessments;
import java.io.*;

public class Practise {

	public static void main(String[] args) throws IOException{
		try {	
			FileWriter fw = new FileWriter("ht.txt");
			fw.write("Hello World\n");
			
			fw.write("Is everyone doing okay?");
			
			fw.close();
			
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
