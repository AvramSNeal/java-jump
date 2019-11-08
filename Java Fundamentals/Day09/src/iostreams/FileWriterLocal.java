package iostreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterLocal {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File folder = new File("MyFolder");
		File test = new File("test.txt");
		//try { 
			new FileOutputStream(test).write("This is a test from FileWriterLocal.java".getBytes());
		//}catch(IOException x) {}
		
		
		if (!folder.exists())
			folder.mkdir();
		else {
			File file = new File(folder, "data.txt");
			System.out.println("Absolute path:" + file.getAbsolutePath());
			System.out.println("Parent folder:" + file.getParent());
			//file.
			
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("This is a file written by Java".getBytes());
			
			fos.close();
		}

	}

}
