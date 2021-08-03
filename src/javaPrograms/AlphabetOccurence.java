package javaPrograms;
import java.util.HashMap;
public class AlphabetOccurence {

	public static void main(String[] args) {
		
		String str = "This is my java program!";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char [] ch = str.toCharArray();
		for(char chr : ch) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr)+1);
			}
			else {
				map.put(chr, 1);
			}
		}
		
		System.out.println(map); // This can be used to print the complete map.
	}
}
