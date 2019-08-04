package day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSort {
	public void testLambdas() {
		String[] strings = {"a", "st", "r", "ing", "e2", "m007", "e1"};
		String[] stringsCopy = {"a", "st", "r", "ing", "e2", "m007", "e1"};
		
		// length
		Lambdas sortByLengthAsc = sort -> {
			return Arrays.asList(strings)
					.stream()
					.sorted((s1, s2) -> s1.length() - s2.length())
					.collect(Collectors.toList())
					.toArray(strings);
		};
		
		// reverse
		Lambdas sortByLengthDesc = sort -> {
			return Arrays.asList(strings)
					.stream()
					.sorted((s1, s2) -> s2.length() - s1.length())
					.collect(Collectors.toList())
					.toArray(strings);
		};
		
		// alpha order
		Lambdas sortByFirstLetter = sort -> {
			return Arrays.asList(strings)
					.stream()
					.sorted((s1, s2) -> s1.charAt(0) - s2.charAt(0))
					.collect(Collectors.toList())
					.toArray(strings);
		};
		
		// contains e
		Lambdas sortByE = sort -> {
			List<String> sorted = Arrays.asList(strings)
					.stream()
					.filter(s -> s.charAt(0) == 'e')
					.sorted()
					.collect(Collectors.toList());
			List<String> doesntStartWithE = Arrays.asList(strings)
					.stream()
					.filter(s -> s.charAt(0) != 'e')
					.sorted()
					.collect(Collectors.toList());
			sorted.addAll(doesntStartWithE);
			return sorted.toArray(strings);
		};
		
		System.out.println("Length (ascending):\n" + Arrays.toString(strings) + "\n-> " + Arrays.toString(sort(strings, sortByLengthAsc)) + "\n");
		System.out.println("Length (descending):\n" + Arrays.toString(strings) + "\n-> " + Arrays.toString(sort(strings, sortByLengthDesc)) + "\n");
		System.out.println("Alphabetical (1st char):\n" + Arrays.toString(strings) + "\n-> " + Arrays.toString(sort(strings, sortByFirstLetter)) + "\n");
		System.out.println("Contains E (w/o helper):\n" + Arrays.toString(strings) + "\n-> " + Arrays.toString(sort(strings, sortByE)) + "\n");
		
		Arrays.sort(stringsCopy, (s1,s2) -> sortByE(s1,s2));
		System.out.println("Contains E (with helper):\n" + Arrays.toString(strings) + "\n-> " + Arrays.toString(stringsCopy) + "\n");
	}
	
	interface Lambdas {
		String[] sort(String[] list);
	}
	
	public static String[] sort(String[] list, Lambdas lambda) {
		return lambda.sort(list);
	}
	
	public static int sortByE(String s1, String s2) {
		boolean aHasE = s1.charAt(0) == 'e';
		boolean bHasE = s2.charAt(0) == 'e';

		// note: if a string has 'e', it precedes the other (hence returns the negative integer)
		if (aHasE && !bHasE) return -1;
		else if (!aHasE && bHasE) return 1;
		else return s1.compareTo(s2);
	}
}
