package day3;

public class TestClass {
	
	// Test for listing files & directories
	public void testDirectory(String filepath) {
		Directory dir = new Directory();
		String initialIndent = "";
		
		System.out.println("============== Print all file and directory names ==============");
		System.out.println(filepath);
		// dir.listTopLevelOnly(filepath);
		dir.listAllFiles(filepath, initialIndent);
		System.out.println("================================================================\n");
	}
	
	// Test for appending text to a file
	public void testFileAppend(String filepath, String text) {
		System.out.println("=============== Append text to the end of a file ===============");
		System.out.println("Text to append: " + text + "\n");
		FileAppend appender = new FileAppend();
		appender.appendToFile(filepath, text);
		System.out.println("================================================================\n");
	}
	
	// Test for counting character frequency in a file
	public void testCharFrequency(String filepath, String charToCount) {
		System.out.println("=========== Count frequency of a character in a file ===========");
		CharFrequency charCounter = new CharFrequency();
		charCounter.countCharFrequency(filepath, charToCount.charAt(0));
		System.out.println("================================================================\n");
	}

	public static void main(String[] args) {
		TestClass tester = new TestClass();
		
		String currentWorkingDirectory = System.getProperty("user.dir") + "\\src";
		
		tester.testDirectory(currentWorkingDirectory);
		tester.testFileAppend("FileAppendTest.txt", "The quick brown fox jumps over the lazy dog.");
		tester.testCharFrequency("FileAppendTest.txt", args[0]);
	}

}
