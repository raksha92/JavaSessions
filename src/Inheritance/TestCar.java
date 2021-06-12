package Inheritance;

public class TestCar {

	public static void main(String[] args) {

//		Bmw bm = new Bmw();
//		bm.start(); //overridden method is called from BMW class
//		bm.steering(); //parent class method is called
//		bm.stop(); //Bmw class method is called
//		
//		System.out.println("---------------");
//		
//		Car cc = new Car();
//		cc.start(); //method from Car class
//		cc.steering(); //method from car class
		Vehicle v1 = new Bmw();
		v1.start();
		v1.mileage();

	}
}
