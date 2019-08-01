package day3;
import java.io.*;

public class FileAppend {

	public void appendToFile(String filepath, String text) {
		try {
			File file = new File(filepath);
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true));
			fileWriter.write(text + "\n");
			fileWriter.close();
			
			System.out.println("Contents of " + file.getName() + ":");
			BufferedReader fileReader = new BufferedReader(new FileReader(file));
			String line;
			while((line = fileReader.readLine()) != null) System.out.println(line);
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
