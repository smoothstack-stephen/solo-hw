package day3;

public class TestClass {
	
	// Test for listing files & directories
	public void testDirectory(String filepath) {
		Directory dir = new Directory();
		System.out.println("[root] " + filepath);
		dir.listFiles(filepath);
		System.out.println();
	}
	
	// Test for appending text to a file
	public void testFileAppend(String filepath, String text) {
		System.out.println("Text to append: " + text + "\n");
		FileAppend appender = new FileAppend();
		appender.appendToFile(filepath, text);
		System.out.println();
	}
	
	public void testCharFrequency(String filepath, char charToCount) {
		CharFrequency charCounter = new CharFrequency();
		charCounter.countCharFrequency(filepath, charToCount);
		System.out.println();
	}

	public static void main(String[] args) {
		TestClass tester = new TestClass();
		
		tester.testDirectory("C:\\Users\\stnam\\smoothstack2019\\solo-hw");
		//tester.testFileAppend("C:\\Users\\stnam\\smoothstack2019\\solo-hw\\src\\day3\\FileAppendTest.txt", "Hi Akbar!");
		//tester.testCharFrequency("C:\\Users\\stnam\\smoothstack2019\\solo-hw\\src\\day3\\FileAppendTest.txt", 'H');
	}

}
