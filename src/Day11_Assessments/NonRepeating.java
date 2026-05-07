package Day11_Assessments;
import java.util.*;

public class NonRepeating {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		String x = "aabbbccdde";
		
		for(char ch : x.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> a : map.entrySet()) {
			if(a.getValue() == 1) {
				System.out.print("First non-repeating: " + a.getKey());
				break;
			}
		}
	}

}
