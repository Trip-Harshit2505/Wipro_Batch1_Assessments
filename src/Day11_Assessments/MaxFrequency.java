package Day11_Assessments;

import java.util.*;

public class MaxFrequency {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int[] arr = {1, 3, 2, 1, 4, 4, 4, 4, 4, 1, 3, 3, };
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int mapKey = -1;
		int maxCount = 0;
		
		for(Map.Entry<Integer, Integer> a : map.entrySet()) {
			if(a.getValue() > maxCount) {
				maxCount = a.getValue();
				mapKey = a.getKey();
			}
		}
		
		System.out.println("Element: " + mapKey + ", Frequency: " + maxCount);
	}

}
