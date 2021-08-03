package stringPrograms;

public class VowelConsonantCount {

	public static void main(String[] args) {

		String str = "This is a really simple sentence";
		
		int vowCount =0, consCount=0;
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i) == ' ')) {
				if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
					vowCount++;
				}
				else {
					consCount++;
				}
			}
			
		}
		
		System.out.println("The vowel count is :" + vowCount);
		System.out.println("The consonants count is :"+ consCount);
	}

}
