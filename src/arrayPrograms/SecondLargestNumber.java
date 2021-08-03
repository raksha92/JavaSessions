package arrayPrograms;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int arr[]={44,66,99,77,33,22,55,11,55,33,22,88}; 
		
		Arrays.sort(arr);
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int tempArr[] = new int[arr.length];
		int j =0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				tempArr[j] = arr[i];
				j++;
			}
		}
		tempArr[j] = arr[arr.length-1];
		
		for(int i=0; i<=j; i++) {
			arr[i] = tempArr[i];
		}
		
		for(int i=0; i<=j; i++) {
			System.out.println(arr[i]);
		}
	}

}
