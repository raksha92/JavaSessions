package javaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "RAKSHA";
		
		if (str.equals("raksha")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		switch (str) {
		case "Raksha":
			System.out.println(str + " is a good girl!");
			break;
			
		case "Monty":
			System.out.println(str + " is a good boy!");
			break;

		default:
			System.out.println(str + " is not a valid name!");
			break;
		}
		
		final String college = "OXFORD";
		switch("STANFORD")
		{
		case college: System.out.println("EXAM TIME"); break;
		default: System.out.println("UNKNOWN");
		}
		
		
		final int persons = 45;
		int random = 45;
		switch(random)
		{
		  case persons: System.out.println("CRICKET ");
		  case 50: System.out.println("tale");
		  default: System.out.println("RUGBY");
		}

	}

}
