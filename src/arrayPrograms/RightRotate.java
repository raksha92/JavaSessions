package arrayPrograms;

public class RightRotate {

	public static void main(String[] args) {

		int arr[] = new int[] {1,2,3,4,5};
		
		for(int n =0; n<3; n++) {
			int initialLast = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = initialLast;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
