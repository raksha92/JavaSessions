package arrayPrograms;

public class CopyArray {

	public static void main(String[] args) {

		int arr1[] = {1,2,3,4,2,1,9,2,7,1,0};
		
		int arr2[]=new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
