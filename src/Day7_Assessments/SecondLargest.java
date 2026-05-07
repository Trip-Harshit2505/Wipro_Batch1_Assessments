package Day7_Assessments;
import java.util.*;

public class SecondLargest {
	
	public static int SLargest(ArrayList<Integer> li) {
		int largest = Integer.MIN_VALUE;
		int sLargest = Integer.MIN_VALUE;
		for(int x : li) {
			if(x > largest) {
				sLargest = largest;
				largest = x;
			}else if(x < largest && x > sLargest) {
				sLargest = x;
			}
		}
		return sLargest;
	}

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(12);
		li.add(25);
		li.add(9);
		li.add(2);
		li.add(30);
		li.add(19);
		
		int s = SLargest(li);
		
		System.out.println(s);
		
	}

}
