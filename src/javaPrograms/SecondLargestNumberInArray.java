package javaPrograms;
import java.util.Arrays;
public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int num [] = {1, 2, 4, 5, 6, 2, 12, 98, 89};
		
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
	}
}
