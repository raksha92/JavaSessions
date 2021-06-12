package exceptionHandling;
public class TryCatchConcept {
	
		String name = "Raksha";
		
	public static void main(String[] args) {
		
		System.out.println("This is code before try block");
		
		TryCatchConcept obj = null;
		
		try {
			int i = 9;
			System.out.println(obj.name);
		}
		catch(NullPointerException e) {
			System.out.println("This is a nullPointer exception code");
			e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			System.out.println("This is arithmetic exception");
		}
		System.out.println("This is code after catch block!");
	}
}
