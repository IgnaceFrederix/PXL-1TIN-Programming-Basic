package opdracht6;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Opdracht6 {

	public static void main(String[] args) {
		ZonedDateTime has = ZonedDateTime.now();
		System.out.println(has);
		
		ZoneId zoneLonden = ZoneId.of("Europe/London");
		ZonedDateTime nulon = ZonedDateTime.now(zoneLonden);
		System.out.println(nulon);
		
		ZoneId zoneSydney = ZoneId.of("Australia/Sydney");
		ZonedDateTime syd = ZonedDateTime.now(zoneSydney);
		System.out.println(syd);
		
		ZoneId zoneMin4 = ZoneOffset.ofHours(-4);
		ZonedDateTime numin4 = ZonedDateTime.now(zoneMin4);
		System.out.println("-4" + numin4);
		

	}

}
