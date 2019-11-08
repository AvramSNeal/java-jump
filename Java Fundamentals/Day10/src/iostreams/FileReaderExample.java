package iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		//set up file and stream
		File inFile = new File("./src/iostreams/Data.txt"); // Not case-sensitive?
		FileReader fileReader;
		try {
			fileReader = new FileReader(inFile);
			
			BufferedReader buffReader = new BufferedReader(fileReader);
			String str;
			
			str = buffReader.readLine();
			while(str!=null) {
				System.out.println(str);
				str = buffReader.readLine();
			}
			buffReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		}

	}

}
