package opdrach6;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		LocalDate geboorteDatum =LocalDate.of(1998,2,3);
		
		System.out.println("dit dnr"+ geboorteDatum.getDayOfYear());
		System.out.println("dit is " + geboorteDatum.getDayOfWeek());
		System.out.println("" + geboorteDatum.isLeapYear());

	}

}
