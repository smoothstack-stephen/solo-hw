package day4;
import java.util.*;
import java.util.stream.*;

public class LambdaStrings {
	interface CommaSeparated {
		void commaString(List<Integer> list);
	}
	
	interface StartsWithA {
		void threeLetterA(List<String> list);
	}
	
	public void commaString(List<Integer> list) {
		List<String> strings = list.stream()
								.map(s -> s % 2 == 0 ? "e"+s.toString() : "o"+s.toString())
								.collect(Collectors.toList());
			
		System.out.println("Even/odd joined strings:\n" + list + "\n-> " + String.join(",", strings));
		System.out.println();
	}
	
	public void threeLetterA(List<String> list) {
		List<String> result = list.stream()
								.filter(s -> (s.length() == 3) && (s.charAt(0) == 'a'))
								.collect(Collectors.toList());
		
		System.out.println("Starts with 'a', 3 letter words:\n" + list + "\n-> " + result);
		System.out.println();
	}

	public void testLambdaStrings() {
		List<Integer> ints = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		List<String> strings = new ArrayList<>(
				Arrays.asList("aaron","abigail","amy","andy","ari","bob"));
		
		commaString(ints);
		threeLetterA(strings);
	}
	
}
