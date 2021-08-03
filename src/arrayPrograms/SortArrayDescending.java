package arrayPrograms;

public class SortArrayDescending {

	public static void main(String[] args) {

		int arr[] = new int[] {1, 4, 5, 7, 8, 9};
		int temp;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
