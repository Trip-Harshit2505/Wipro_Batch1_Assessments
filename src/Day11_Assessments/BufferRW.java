package Day11_Assessments;
import java.io.*;

public class BufferRW {

	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new FileReader("ht.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
		) {
			String line;
			
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			
			System.out.println("File copied successfully");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
