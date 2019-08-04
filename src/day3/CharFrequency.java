package day3;
import java.io.*;

public class CharFrequency {

	public void countCharFrequency(String fileName, char charToCount) {
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\day3\\" + fileName;
			File file = new File(filePath);
			BufferedReader fileReader = new BufferedReader(new FileReader(file));
			int frequency = 0;
			
			String sourceText = "";
			String line;
			char letter;
			while((line = fileReader.readLine()) != null) {
				sourceText += line + "\n";
				for(int i=0; i<line.length(); i++) {
					letter = line.charAt(i);
					if (letter == charToCount) frequency++;
				}
			}
			
			System.out.println("Source text: \n" + sourceText);
			System.out.println("Frequency of " + charToCount + " = " + frequency);
			fileReader.close();
		} catch (IOException e) {
			
		}
	}
	
}
