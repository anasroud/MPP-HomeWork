package lab9b.prob7;

import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		List<Integer> x = ordering1(intList);
		System.out.println(x); // Output: [0, -1, 1, -2, 2, -3, 3]

		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		List<String> y = ordering2(stringList);

		System.out.println(y); // Output: [0, -1, 1, -2, 2, -3, 3]


	}

	public static List<Integer> ordering1(List<Integer> list) {
		return list.stream()
				.sorted(Comparator.comparingInt(i -> Math.abs((Integer) i)) // Use lambda for Math.abs
						.thenComparingInt(i -> (int) i)) // Sort by natural order
				.collect(Collectors.toList());	}

	public static List<String> ordering2(List<String> list) {
		return list.stream()
				.sorted(Comparator.comparing(s -> new StringBuilder(s).reverse().toString()))
				.collect(Collectors.toList());
	}
}
