package arrayPrograms;

public class LeftRotateArray {

	public static void main(String[] args) {

		int arr[] = new int[] {1,2,3,4,5};
		int j, initialFirst;
		
		for(int i=0; i<2; i++) {
			initialFirst = arr[0];
			for(j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = initialFirst;
		}
		

		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
