package Day11_Assessments;
import java.io.*;

public class BufferedW {

	public static void main(String[] args) throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("ht.txt", true)))
		{
			bw.newLine();
			bw.write("Take a chill pill!");
			bw.newLine();
			bw.write("Everything is going smooth.");
			
			System.out.println("Written successfully!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
