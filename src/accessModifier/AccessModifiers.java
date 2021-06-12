package accessModifier;

public class AccessModifiers {

	String name; //if no modifier written, means that is default
	private String engine;
	public int price;
	protected String color;
	
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		am.name = "Raksha";
		am.engine = "Bmw";
		am.price = 1000000;
		am.color = "Black";

	}
}
