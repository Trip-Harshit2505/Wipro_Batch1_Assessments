package Day2_Assessment;

import java.util.Scanner;

public class Array_types {
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		int z = 3;
		int[][][] arr = new int[x][y][z];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					System.out.println("Enter the element: " + i + " " + j + " " + k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		sc.close();
		
		System.out.println("=====Display array=======");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
