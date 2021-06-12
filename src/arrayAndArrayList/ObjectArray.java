package arrayAndArrayList;
public class ObjectArray {
	public static void main(String[] args) {

		Object obj[] = new Object[5];
		obj[0] = 'F';
		obj[1] = "Raksha";
		obj[2] = 28;
		obj[3] = 6.95;
		obj[4] = true;
				
		for(Object e : obj) {
			System.out.println(e);
		}
	}
}
