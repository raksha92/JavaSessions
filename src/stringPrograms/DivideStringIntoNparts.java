package stringPrograms;

public class DivideStringIntoNparts {

	public static void main(String[] args) {

		String str = "This is again a new Java world";
		
		int length = str.length();
		int diviNum = 3;
		int partLength = length/diviNum;
		int tempIndex = 0;
		String arr[] = new String[diviNum];
		
		if(length%diviNum != 0) {
			System.out.println("The string is not divisible into equal parts number: " + diviNum);
		}
		else {
			System.out.println("The string is divisible");
			for(int i=0; i<str.length(); i=i+partLength) {
				String parts = str.substring(i, i+partLength);
				arr[tempIndex] = parts;
				tempIndex++;
				System.out.println(parts);
			}
		}
	}

}
