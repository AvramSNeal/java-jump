package helloworld;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates{

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(date));

	}

}
