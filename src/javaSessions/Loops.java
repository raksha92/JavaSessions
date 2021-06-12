package javaSessions;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 
		for(int i=1; i<=5; i++) {
			System.out.println("I am Batman\n");
		}
		
		// 2. 
		for(int i=1; i<10; i++) {
			System.out.println("I am Batman "+i +"\n");
		}
		
		// 3. WAP to print 10 to 1 using for, while and do-while loop
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		int i = 10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		
		int j = 10;
		do {
			System.out.println(j);
			j--;
		}
		while(j>0);
		
		
		// 4. Write a program in Java to print "Hello World" ten times using while loop
		int a = 1;
		while(a<=10) {
			System.out.println("Hello World");
			a++;
		}
		
		// 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int x = 1;
		while(x<=10) {
			if(x % 7 == 0) {
				break;
			}
			System.out.println(x);
			x++;
		}
		
		// 6. Print even number (0 2 4 6 8 10) using for/while/dowhile loop.
		for(int y=0; y<=10; y++) {
			if(y % 2 == 0) {
				System.out.println(y);
				y++;
			}
		}
		
		int m = 0;
		while(m<=10) {
			if(m % 2 == 0) {
				System.out.println(m);
			}
			m++;
		}
				
		int n = 0;
		do {
			if(n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
		while(n<=10);
		
		// 7. Print odd number (1 3 5 7 9) using for/while/dowhile loop.
		for(int z=1; z<=10; z++) {
			if(z % 2 != 0) {
				System.out.println(z);
			}
			z++;
		}
		
		int z1 = 1;
		while(z1<=10) {
			if(z1 % 2 != 0) {
				System.out.println(z1);
			}
			z1++;
		}
		
		int z2 = 1;
		do {
			if(z2 % 2 != 0) {
				System.out.println(z2);
			}
			z2++;
		}
		while(z2<=10);
	}

}
