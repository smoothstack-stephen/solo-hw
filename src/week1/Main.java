package week1;
import java.util.*;
import java.util.stream.*;

public class Main {

	public void testPerformOperation() {
		System.out.println("================== Assignment 1 ==================");
		PerformOperation operator = new PerformOperation();
		Scanner scan = new Scanner(System.in);
		int lineCount = Integer.parseInt(scan.nextLine());
		
		ArrayList<String> lines = new ArrayList<>();
		IntStream.range(0, lineCount).forEach(addLine -> lines.add(scan.nextLine()));
		scan.close();
		
		lines.forEach(line -> {
			String[] lineArray = line.split(" ");
			int condition = Integer.parseInt(lineArray[0]);
			int value = Integer.parseInt(lineArray[1]);
			operator.performOperation(condition, value);
		});
		System.out.println("==================================================\n");
	}

	public void testRightMostDigits() {
		System.out.println("================== Assignment 2 ==================");
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(90, 81, 72, 63, 54, 45, 36, 27, 18, 9));
		
		List<Integer> result = numbers.stream()
				.map(number -> number % 10)
				.collect(Collectors.toList());
		
		System.out.println(numbers + "\n -> " + result);
		System.out.println("==================================================\n");
	}

	public void testDoubleList() {
		System.out.println("================== Assignment 3 ==================");
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		List<Integer> result = numbers.stream()
				.map(number -> number * 2)
				.collect(Collectors.toList());
		
		System.out.println(numbers + "\n -> " + result);
		System.out.println("==================================================\n");		
	}
	
	public void testRemoveX() {
		System.out.println("================== Assignment 4 ==================");
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("no", "onex", "xtwox", "xxxthree"));
		
		List<String> result = strings.stream()
				.map(s -> s.replace("x",""))
				.collect(Collectors.toList());
		
		System.out.println(strings + "\n-> " + result);
		System.out.println("==================================================\n");		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.testPerformOperation();
		main.testRightMostDigits();
		main.testDoubleList();
		main.testRemoveX();
	}

}
