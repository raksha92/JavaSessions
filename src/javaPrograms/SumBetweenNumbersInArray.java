package javaPrograms;

public class SumBetweenNumbersInArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5,6,4,9,6,7,5,3,2,9,4};
		int sum = 0;
		loop: //this is a user defined variable
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == 5) {
				sum = sum +5;
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j] == 9) {
						sum = sum+9;
						i = j;
						continue loop;
					}
					System.out.println("This is inner loop!");
				}
			}
			System.out.println("This is outer loop!");
			sum = sum + arr[i];
			System.out.println(sum);
		}

	}

}
