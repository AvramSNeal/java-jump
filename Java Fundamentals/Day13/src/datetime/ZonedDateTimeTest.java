package datetime;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String args[]) {
		ZonedDateTimeTest zonedDateTimeTest = new ZonedDateTimeTest();
		
		zonedDateTimeTest.testZonedDateTime();
	}
	
	public void testZonedDateTime() {
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime
				.parse("2018-12-28T10:15:30+05:30[Asia/Kolkata]");
		System.out.println("date1: " + date1);
		
		//converts time zones
		ZoneId id = ZoneId.of("Europe/Paris");
		
		System.out.println("ZoneId: " + id);
		
		ZonedDateTime parisDateTime =
		
		date1.toInstant().atZone(id);
		
		System.out.println(parisDateTime);
		
		//adds four days
		ZonedDateTime newZoneDateTime =
		
		date1.plus(Period.ofDays(4));
		
		System.out.println(newZoneDateTime);
		
		//your current zone
		ZoneId currentZone = ZoneId.systemDefault();
		
		System.out.println("CurrentZone: " + currentZone);
	}
}