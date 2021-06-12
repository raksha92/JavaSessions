package superKeyword;

public class BmwCar extends Car {
	int speed = 200;
	String name;
	
	public BmwCar() {
		super(1);
		System.out.println("The child class constrcutor");
	}
	
	public BmwCar(String name) {
		super(1);
		this.name = name;
		System.out.println("The child class constrcutor");
	}
	
	public void checkSpeed() {
		System.out.println(super.speed);
	}
	
	public void display() {
		 System.out.println("BmwCar display");
		 super.display();
	 }
}
