package day3;
import java.io.*;

public class CharFrequency {

	public void countCharFrequency(String filepath, char charToCount) {
		try {
			File file = new File(filepath);
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
			
		} catch (IOException e) {
			
		}
	}
	
}
