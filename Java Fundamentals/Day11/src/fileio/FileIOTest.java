package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

/**
 * Program that reads lines from an input text file (inputFile.txt),
 *  then writes them to an output file(outputFile.txt), excluding duplicate lines.
 * Make use of:
 * - BufferedReader - to read lines from input file
 * - HashSet add() method - to store lines without duplicates
 * - PrintWriter - to write lines of text to the output file
 */

public class FileIOTest {
	
	public static void main(String[] args) throws IOException {
		
		// PrintWriter object for output.txt
		PrintWriter pw = new PrintWriter("./src/fileio/outputFile.txt");
		//BufferedReader object for input.txt
		BufferedReader br = new BufferedReader(new FileReader("./src/fileio/inputFile.txt"));
		String line = br.readLine();
		// set store unique values
		HashSet<String> hs = new HashSet<String>();
		// loop for each line of input.txt
		while(line != null) {
			// write only if not present in hashset
			if(hs.add(line)) {
				pw.println(line);
			}
			line = br.readLine();
		}
		pw.flush();
		// closing resources
		br.close();
		pw.close();

	}
	


}
