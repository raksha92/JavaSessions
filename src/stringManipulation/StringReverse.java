package stringManipulation;
public class StringReverse {

	public static void main(String[] args) {
		
		
		String s = "My name is \"Raksha\" and I love Java!!";
		System.out.println(s);
		
//		System.out.println(revString("selenium"));
//		System.out.println(revString(null));
		
//		String text = "JAVA_PYTHON_RUBY_JAVASCRIPT";
//		String result = "";
//		String [] textArray = text.split("_");
//		String [] revArray = new String[textArray.length];
//		for(int i=0; i<textArray.length; i++) {
//			String revString = "";
//			for(int j=textArray[i].length()-1; j>=0; j--) {
//				revString = revString + textArray[i].charAt(j);
//			}
//			
//			revArray[i] = revString;
//			result = result + revArray[i] + "_";
//			
//		}
//		
//		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String revString(String s) {
		
		if(s==null) {
			return "The passed in string is null";
		}
		
		int length = s.length();
		String revString = "";
		for(int i=length-1; i>=0; i--) {	
			revString = revString + s.charAt(i);
		}
		return revString;
	}
}
