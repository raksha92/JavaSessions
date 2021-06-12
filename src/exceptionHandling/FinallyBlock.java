package exceptionHandling;
public class FinallyBlock {

	public static void main(String[] args){
		System.out.println(getMarks("Raksha"));
	}
	
	public static int getMarks(String name) {
		if(name.equalsIgnoreCase("Tom")) {
			try {
				int i = 9/0;
				return 10;
			}
			catch(ArithmeticException e) {
				System.out.println("hhhh");
				return 50;
			}
			finally {
				System.out.println("I m finally block");
				return 100;
			}
		}
		return -1;
	}
}
