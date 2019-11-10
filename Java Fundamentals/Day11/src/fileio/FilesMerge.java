package fileio;

import java.io.*;

/**
 * 
 * Program that reads lines from 2 text files ,
 *  and writes them in a 3rd text file alternating
 *  one line from file1 and one line from file2
 * Continue writing all the lines from the longer file
 * 
 * This program makes use of :
 *  BufferedReader to read lines of text
 *  PrintWriter to write lines of text to a file
 */

public class FilesMerge {

	public static void main(String[] args) throws IOException {
		
		// PrintWriter object for output text file
		PrintWriter pw = new PrintWriter("./src/fileio/filesmerged.txt");
		
		//BufferedReader object for input text file(s)
		BufferedReader 	br1 = new BufferedReader(new FileReader("./src/fileio/file1.txt")),
						br2 = new BufferedReader(new FileReader("./src/fileio/file2.txt"));
		
		String 	line1 = br1.readLine(),
				line2 = br2.readLine();
	
		while(line1 != null || line2 != null) {
			if(line1!=null)pw.println(line1);
			line1 = br1.readLine();
			if(line2!=null)pw.println(line2);
			line2 = br2.readLine();
		}
		pw.flush();
		// closing resources
		br1.close();
		br2.close();
		pw.close();

	}

}
