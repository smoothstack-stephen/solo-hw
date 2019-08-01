package day3;
import java.io.*;

public class Directory {

	public void listFiles(String filepath) {
		try {
			File folder = new File(filepath);
			File[] files = folder.listFiles();
			for (File entry : folder.listFiles()) {
				if (entry.isDirectory()) {
					System.out.println("[dir] " + entry.getCanonicalPath());
					listFiles(entry.getAbsolutePath());
				}
				if (entry.isFile()) System.out.println("  > " + entry.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
