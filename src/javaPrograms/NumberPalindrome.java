package javaPrograms;

public class NumberPalindrome {

	public static void main(String[] args) {

		int num = 323, revNum = 0, remainder;
		int tempNum = num;
		while(num>0) {
			remainder = num%10;
			revNum = (revNum*10)+remainder;
			num = num/10;
		}
		System.out.println(revNum);
		
		if(tempNum == revNum) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}

}
