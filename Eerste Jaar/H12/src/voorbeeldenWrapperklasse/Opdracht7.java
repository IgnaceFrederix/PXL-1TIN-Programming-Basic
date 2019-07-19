package voorbeeldenWrapperklasse;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Opdracht7 {

	public static void main(String[] args) {
		ZoneId londenZone = ZoneId.of("Europe/London");
		ZoneId sydneZone = ZoneId.of("Australia/Sydney");
		ZoneId losZone=  ZoneId.of("America/Los_Angeles");
		ZoneId otherZone = ZoneOffset.ofHours(-4);
		
		ZonedDateTime nowBrussel = ZonedDateTime.now();
		ZonedDateTime nowLondon = ZonedDateTime.now(londenZone);
		ZonedDateTime nowSydney = ZonedDateTime.now(sydneZone);
		ZonedDateTime nowLos = ZonedDateTime.now(losZone);
		ZonedDateTime nowOther = ZonedDateTime.now(otherZone);
		
		System.out.println(nowBrussel);
		System.out.println(nowLondon);
		System.out.println(nowSydney);
		System.out.println(nowLos);
		System.out.println(nowOther);
	}

}
