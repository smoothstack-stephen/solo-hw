package day3;
import java.io.*;

public class Directory {

	public void listAllFiles(String filepath, String indent) {
		File folder = new File(filepath);
		File[] files = folder.listFiles();
		for (File entry : files) {
			if (entry.isDirectory()) {
				System.out.println(indent + "- [" + entry.getName() + "]");
				listAllFiles(entry.getAbsolutePath(), indent + "   ");
			}
			if (entry.isFile()) System.out.println(indent + "- " + entry.getName());
		}
	}
	
	public void listTopLevelOnly(String filepath) {
		File folder = new File(filepath);
		File[] files = folder.listFiles();
		for (File entry : files) {
			System.out.println(entry.getName());
		}
	}
}
