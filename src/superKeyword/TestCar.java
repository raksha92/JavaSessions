package superKeyword;

public class TestCar {

	public static void main(String[] args) {

		BmwCar b = new BmwCar("bmw car");
		System.out.println(b.speed);
		b.checkSpeed();
		
		b.display();
		
		System.out.println(b.name);
	}

}
