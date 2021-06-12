package javaSessions;

public class IncrementDecrementOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=19, j=29, k;
        
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        
        int m=1010, n=1010;
        
        System.out.println(m++ / ++n * n-- / --m);
        
        
        
        int x = 001, y=10, z=100;
        int i1 = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        
        //int i1 = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i1);
        
        
        
    	int v = 2;
		System.out.println(v++);
		System.out.println(v);
		
		int hh = 3;
		System.out.println(++hh);
	}

}
