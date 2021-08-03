package stringPrograms;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "mom";
		
		String revString = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			revString += str.charAt(i);
		}
		System.out.println(revString);

		if(str.equals(revString)) {
			System.out.println("The string is an palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
	}

}
