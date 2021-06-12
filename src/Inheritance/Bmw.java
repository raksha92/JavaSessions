package Inheritance;

public class Bmw extends Car{
	
	@Override
	public void start() {
		System.out.println("The start method of BMW class");
	}
	
	public void stop() {
		System.out.println("This is stop method for BMW");
	}
}
