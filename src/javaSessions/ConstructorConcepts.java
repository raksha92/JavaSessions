package javaSessions;

public class ConstructorConcepts {
	String name;
	int age;

	public ConstructorConcepts () {
		System.out.println("I am a default constructor");
	}
	
	public ConstructorConcepts (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("I am a two param constructor");
	}
	
	
	public static void main(String[] args) {
		ConstructorConcepts c1 = new ConstructorConcepts();
		ConstructorConcepts c2 = new ConstructorConcepts("Raksha", 28);
		System.out.println(c2.name);
		System.out.println(c2.age);
	}

}
