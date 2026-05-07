package Day11_Assessments;
import java.util.*;

public class DuplicateCh {

	public static void main(String[] args) {
		String s = "aabbbbcccdee";
		
		HashSet<Character> set = new HashSet<>();
		
		for(char ch : s.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder res = new StringBuilder();
		
		for(char ch : set) {
			res.append(ch);
		}
		
		System.out.println("Without Duplicates: " + res);

	}

}
