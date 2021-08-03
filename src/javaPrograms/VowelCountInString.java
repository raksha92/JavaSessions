package javaPrograms;
public class VowelCountInString {
	public static void main(String[] args) {

		String str = "This is Fis global org";

		char ch []= str.toCharArray();
		int count = 0;
		for (char c : ch) 
		{ 

			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			default:
				break;
			}
		}
		System.out.println(count);
	}
}
