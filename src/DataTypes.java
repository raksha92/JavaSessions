
public class DataTypes {

	public static void main(String[] args) {

		//1 byte = 8 bits
		byte b = 10; //byte takes 1 byte memory space, range: -128 to +127
		System.out.println(b);
		
		short sh = 100; //short takes 2 bytes, range: -32768 to +32768
		System.out.println(sh);
		
		int i = 5500; //int takes 4 bytes, range: 10 digits
		System.out.println(i);
		
		long l = 100000; //long takes 8 bytes, range: more than 10 digits
		System.out.println(l);
		
		float fl = 12.33f; //float takes 
		float f2 = (float) 12.33; // while defining float numbers, we either need to add cast to the value of add a suffix 'f' to the number. Here both f1 and f2 are same.

	}

}
