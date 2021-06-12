package exceptionHandling;
public class ThrowKeyword {
	public static void main(String[] args) {

		try {
			throw new Exception("new exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		} 

		String data = "";
		
		if(data.equals("")) {
			try {
				throw new Exception("blank data exception");
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
				System.out.println(e.getMessage());
			}
		}
	}
}
