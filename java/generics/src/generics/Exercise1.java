package generics;

import java.util.Arrays;
import java.util.Collection;

public class Exercise1 {

	public static void main( String[] args ) throws Exception {
		Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
		int count = countIf(ci);
		System.out.println("Number of odd integers = " + count);
	}

	public static <T> int countIf(Collection<T> c) {
		int count = 0;
		for (T elem : c) {
			++count;
		}
		return count;
	}
}
