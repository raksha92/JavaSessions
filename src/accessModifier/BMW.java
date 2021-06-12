package accessModifier;

public class BMW extends AccessModifiers {

	public static void main(String[] args) {

		BMW bm = new BMW();
		bm.name  = "Raksha";
		bm.price = 1000000;
		bm.color = "Black";
		//bm.engine = "bmw"; //can not access the private 
		
	}

}
