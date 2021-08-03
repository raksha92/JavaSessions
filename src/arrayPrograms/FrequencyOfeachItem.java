package arrayPrograms;

public class FrequencyOfeachItem {

	public static void main(String[] args) {

		int arr [] = {1, 5, 2, 3, 4, 5, 3 , 9, 0, 3 , 4};
		int countArr [] = new int [arr.length];
		int visited = -1;
		for(int i =0; i<arr.length; i++) {
			int count = 1;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = visited;
				}
			}
			if(arr[i] != visited) {
				countArr[i] = count;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != visited) {
				System.out.println("The count of " + arr[i] +" is " + countArr[i]);
			}
		}

	}

}
