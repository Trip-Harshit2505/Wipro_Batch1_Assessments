package Day11_Assessments;
import java.io.*;

public class BufferedR {

	public static void main(String[] args) throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("ht.txt")))
		{
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
