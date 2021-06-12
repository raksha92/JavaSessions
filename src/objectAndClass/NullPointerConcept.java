package objectAndClass;
public class NullPointerConcept {
	String name;
	int age;
	public static void main(String[] args) {

		NullPointerConcept obj = new NullPointerConcept();
		obj.name = "Raksha";
		obj.age = 28;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj = null;
		
		System.out.println(obj.name);
	}
}
