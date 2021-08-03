package arrayPrograms;

import java.util.Arrays;

public class largestNumber {

	public static void main(String[] args) {

		int [] arr = new int [] {25, 56, 11, 7, 75, 16}; 
		
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);		
	}
}
