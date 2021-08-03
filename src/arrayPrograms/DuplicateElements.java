package arrayPrograms;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[] = {4,1,4,5,6,7,2,1,9,0,1,6,4,2};
		int visited = -1;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j] && arr[i] != visited) {
					System.out.println("The elements are duplicate" + arr[i]);
					arr[j] = visited;
				}
			}
		}

	}

}
