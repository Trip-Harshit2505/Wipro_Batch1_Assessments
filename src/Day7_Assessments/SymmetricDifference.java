package Day7_Assessments;
import java.util.*;

public class SymmetricDifference {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> result = new HashSet<>();

        for (Integer num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Intersection: " + result);

	}

}
