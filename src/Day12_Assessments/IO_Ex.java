package Day12_Assessments;
import java.io.*;

public class IO_Ex {

	public static void main (String[] args) throws FileNotFoundException, IOException {
		try(FileReader fr = new FileReader("ht.txt"))
		{
			int c;
			
			while((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
