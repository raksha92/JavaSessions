package stringManipulation;
public class StringManipulations {

	public static void main(String[] args) {

		String st = "    This is my java program and i am happy for it!            ";
		String st1 = "My name is Raksha Thakre";
		int x = 100;
		int y = 20;
		
		System.out.println(st.length());
		System.out.println(st.charAt(9));
		System.out.println(st.indexOf("i"));//this will return 1st occurrence of i
		System.out.println(st.indexOf("i", st.indexOf("i")+1)); //this will return the second occurrence of i.
		System.out.println(st.indexOf("i", (st.indexOf("i", st.indexOf("i")+1))+1));
		System.out.println(st.indexOf("java"));
		System.out.println(st.indexOf("hello"));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.trim());
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		System.out.println(st1.contains("Raksha"));
		System.out.println(st1 + x + y);
		System.out.println(st1.concat(st));
		System.out.println(st.substring(st.indexOf("java")).trim());
		System.out.println(st1.substring(st1.indexOf("is"), st1.indexOf("Thakre")).trim());
		
		String st2 = "JAVA_RUBY_PYTHON_JS";
		String[] st3 = st2.split("_");
		System.out.println(st3[0]);
		
		String s = "xXtestingxXXjavaXxXseleniumxXxpythonxX";
		String st4 [] = s.split("xX");
		System.out.println(st4.length);
		System.out.println(st4[0]); //this will return a blank value
		System.out.println(st4[1]);
		System.out.println(st4[2]);
		//System.out.println(st4[5]); //this will return ArrayIndexOutOfBoundsException
		System.out.println("----------------------");
		
		String cred = "test|test123|admin";
		String [] credentials = cred.split("\\|");
		System.out.println(credentials[0]);
		System.out.println(credentials[1]);
	}
}
