package javaSessions;

public class DataTypes {

	public static void main(String[] args) {
		// 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.println("Hello \nRaksha");

		// 2. Write a Java program to print the sum of two numbers.
		int a = 74;
		int b = 36;
		int sum = a + b;
		System.out.println(sum);

		// 3. Write a Java program to divide two numbers and print on the screen.
		int x = 50;
		int y = 3;
		System.out.println(x/y);

		// 4. Write a Java program to print the result of the following operations. Change your test data accordingly.
		int a1 = -5; 
		int a2 = 8; 
		int a3 = 6; 
		int a4, a5;
		System.out.println(a1+(a2*a3));
		
		a1 = 55;
		a2 = 9;
		System.out.println((a1+a2)%a2);
		
		a1 = 20; a2 = -3; a3 = 5; a4 = 8;
		System.out.println(a1+((a2*a3)/a4));
		
		a1 = 5; a2 = 15; a3 = 3; a4 = 2; a5 = 8; // I DID NOT GET THIS ONE
		System.out.println();
		
		
		// 5. Write a Java program to compute the specified expressions and print the output. Go to the editor
		// Test Data:
		//	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		double b1 = 25.5;
		double b2 = 3.5;
		double b3 = 4.5;
		double b4 = 40.5;
		System.out.println(((b1*b2)-(b2*b2))/(b4-b3));
		
		
		// 6. Try to concat "Hello Selenium" with a character 't'.
		char t = 't';
		System.out.println("Hello Selenium" + t);
		
		
		// 7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		int m = 100;
		int n = 200;
		int o = 3400;
		System.out.println("\"Your total amount is:" + (m+n+o)+ "\".");
		
		
		// 8. What should be the output for : (why the output is 53?)
		byte bt = 065; 
		System.out.println(bt);
		
		
		
	}

}
