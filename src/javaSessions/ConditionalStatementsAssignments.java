package javaSessions;

public class ConditionalStatementsAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. Write a Java program to test a number is positive or negative.
		int a = 35;
		a = -11;
		a = 0;
		
		if(a>0) {
			System.out.println("The number " +a+ " is a positive number");
		}
		else if(a<0) {
			System.out.println("The number " +a+ " is a negative number");
		}
		else if(a==0) {
			System.out.println("The number is Zero");
		}
		
		// 4. Write a Java program to test a person is eligible for vote
		int age = 19;
		String status = "alive";
		
		if(age>=18 && status == "alive") {
			System.out.println("The person is eligible for vote");
		}
		else if(age<18 && status == "alive") {
			System.out.println("The person is not eligible for vote");
		}
		else if(status != "alive") {
			System.out.println("The person does not exist");
		}
		
	}

}
