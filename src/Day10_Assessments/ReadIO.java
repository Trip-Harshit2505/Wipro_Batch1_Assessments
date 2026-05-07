package Day10_Assessments;
import java.io.*;

public class ReadIO {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("ht.txt")))
		{
			String line;
			int lineCount = 0;
			int wordCount = 0;
			int charCount = 0;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				lineCount++;
				
				charCount += line.length();
				
				String[] words = line.trim().split(" ");
				if(!line.trim().isEmpty()) {
					wordCount += words.length;
				}
			}
			
			System.out.println("Number of lines: " + lineCount);
			System.out.println("Number of words: " + wordCount);
			System.out.println("Number of characters: " + charCount);
		}
	}

}
