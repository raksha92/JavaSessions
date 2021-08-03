package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int hldngNum, digitCount = 0, remainder;
		int sum = 0;
		
		hldngNum = num;
		while(hldngNum>0) {
			hldngNum = hldngNum/10;
			digitCount++;
		}
		hldngNum = num;
		while(hldngNum>0) {
			remainder = hldngNum%10;
			sum = (int) (sum + Math.pow(remainder, digitCount));
			hldngNum = hldngNum/10;
		}
		
		System.out.println(sum);
		
		if(sum == num) {
			System.out.println("The number is armstrong number!");
		}
		else {
			System.out.println("The number is not an armstrong number!");
		}

	}

}
