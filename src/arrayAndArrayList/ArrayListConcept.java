package arrayAndArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListConcept {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		ar.add(1);
		ar.add(4);
		ar.add(2);
		ar.add(0);
		ar.add(34);
		ar.add(5);
		
		Collections.sort(ar);
		System.out.println(ar);
	}
}
