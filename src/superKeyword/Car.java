package superKeyword;

public class Car {
	int speed = 100;
	
	public Car() {
		System.out.println("The parent class constrcutor");
	}
	// constructor overloaded
	public Car(int a) {
		System.out.println("The parent class constrcutor"+a);
	}
	
	public void start() {
		 System.out.println("car started");
	 }

	public void display() {
		 System.out.println("Car display");
	 }
}
