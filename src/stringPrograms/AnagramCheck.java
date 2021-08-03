package stringPrograms;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

		String str1 = "Brag is rag";
		String str2 = "Grab is arg";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(!(str1.length() == str2.length())) {
			System.out.println("The strings are not of same length and hence not anagram");;
		}
		else {
			
			System.out.println(str1);
			System.out.println(str2);
			
			char arr1 [] = str1.toCharArray();
			char arr2 [] = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("The strings are anagram");
			}
			else {
				System.out.println("The strings are not anagram");
			}
		}
	}

}
