package javaPrograms;

public class ReplaceWordInString {

	public static void main(String[] args) {

		String str = "This is Globant, and we are here talking about Globant and going to get in Globant and then will join Globant!";
		
		//first find the number of words in string
		String arr[] = str.split(" ");
		System.out.println(arr.length);
		
		//now find the occurences of Globant word
		int count = 0;
		for(String s : arr) {
			if(s.contains("Globant")) {
				count++;
			}
		}
		System.out.println(count);
		
		//now need to find the second last occurrence which would be 3
		System.out.println(str.lastIndexOf("Globant"));
		
		
	}

}
