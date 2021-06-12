package exceptionHandling;
public class ThrowsKeyword {
	
	public void m1(){
		m2();
	}
	
	public void m2() throws ArithmeticException{
		try{
			m3();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception thrown");
		}
	}

	public void m3() throws ArithmeticException{
		int i = 9/0;
	}

	public static void main(String[] args){
		ThrowsKeyword th = new ThrowsKeyword();
		th.m1();
	}
}
