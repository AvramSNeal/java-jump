package exceptions;

import java.io.FileOutputStream;

public class FinalVariable {

	public static void main(String[] args) {
		try(FileOutputStream fileStream=new FileOutputStream("./src/exceptions/javatpoint.txt")) {
			String greeting = "Welcome to javaTpoint. Written from FinalVariable.java";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e){
			System.out.println(e);
		} finally {
			
		}
	}

}
