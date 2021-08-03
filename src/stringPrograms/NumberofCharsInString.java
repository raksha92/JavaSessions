package stringPrograms;

public class NumberofCharsInString {

	public static void main(String[] args) {

		String str = "This is new Java world";
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)== ' ')) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
