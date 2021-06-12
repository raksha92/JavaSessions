package javaSessions;

public class JavaPrograms {

	public static void main(String[] args) {

		JavaPrograms jp = new JavaPrograms();
		String st = jp.reverseString("Raksha");
		System.out.println(st);

	}
	
	public String reverseString(String str) {
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
		
	}

}
