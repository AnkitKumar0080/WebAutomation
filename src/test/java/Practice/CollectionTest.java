package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//write a java code to calculate the letter with highest occurance in the given string
public class CollectionTest {
	
	public static void main(String args[]) {
		int count;
		String input = "The committee aAAAAApproved the successful proposal";
		String i_lower = input.toLowerCase();
		char cArr[] = i_lower.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c : cArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		int min = Integer.MIN_VALUE;
		 char c=' ';
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>min) {
				min=entry.getValue();
				c=entry.getKey()	;
				}
			
		}
		System.out.println(c+" --> " + min);
		}
}
