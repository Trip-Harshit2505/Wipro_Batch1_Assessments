package com.math.operations;

class Calculator{
	int a;
	int b;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
}

public class AddAndSub {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println("Addition: " + c.add(7, 5));
		System.out.println("Subtraction: " + c.subtract(22, 7));
	}

}
