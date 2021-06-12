package arrayAndArrayList;
public class TwoDimensionArray {

	public static void main(String[] args) {

		int a[][] = new int[4][5];
				
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) { //(1+n+n) (1+n+n) ==> 1+6n+6n^2+n ==> n(n+1) ==> n^2
				System.out.print(i+""+j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
