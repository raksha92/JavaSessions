package javaPrograms;

public class NumberSwapping {

	public static void main(String[] args) {

		int first = 10, second=20;
		System.out.println("The value of first no: " + first);
		System.out.println("The value of second no: " + second);
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("The value of first no:" + first);
		System.out.println("The value of second no: " +second);
		
		
		
//		This is another way without using third variable.
//		first = first+ second;
//		second = first-second;
//		first = first-second;
//		
//		System.out.println("The value of first no:" + first);
//		System.out.println("The value of second no: " +second);
		
	}
}
