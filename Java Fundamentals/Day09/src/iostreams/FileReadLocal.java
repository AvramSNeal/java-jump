package iostreams;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadLocal {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		int data = fileInputStream.read();
		//file
		while((data!=-1))
		{
			System.out.println((char)data);
			data = fileInputStream.read();
		}
		fileInputStream.close();

	}

}
