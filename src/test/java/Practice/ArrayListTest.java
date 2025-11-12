package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(22);
		arr.add(42);
		arr.add(2);
		arr.add(11);
		arr.add(6);
		arr.add(2);
		arr.set(1, 5);
		Collections.sort(arr);
		for(int i:arr)
			System.out.println(i);

	}

}
