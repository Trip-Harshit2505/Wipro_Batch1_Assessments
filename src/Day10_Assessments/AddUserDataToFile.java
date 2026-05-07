package Day10_Assessments;
import java.io.*;
import java.util.Scanner;

public class AddUserDataToFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the line: ");
		String s = sc.nextLine();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("ht.txt", true)))
		{
			bw.write(s);
			bw.newLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("ht.txt")))
		{
			String line;
			
			System.out.println("\n****READING LINES****");
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
