package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 17;
		int flag = 0;
		if(num==0 || num==1) {
			System.out.println("The number is not prime!");
		}
		else {
			for(int i=2; i<num/2; i++) {
				if(num%i == 0) {
					System.out.println("The number is not prime!");
					flag = 1;
					break;
				}
			}
			
			if(flag != 1) {
				System.out.println("The number is prime number!");
			}
		}
		
	}

}
