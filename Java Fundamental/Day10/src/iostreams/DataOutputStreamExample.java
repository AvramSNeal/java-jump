package iostreams;

import java.io.*;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		File file = new File("./src/iostreams/data.dat");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(12345);
			dos.writeBoolean(true);
			dos.writeChar('w');
			dos.writeUTF(" <- Written from DataOutputStreamExample.java");
			dos.close();
		} catch (FileNotFoundException x) {
			System.out.println("FileNotFoundException: " + x.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
