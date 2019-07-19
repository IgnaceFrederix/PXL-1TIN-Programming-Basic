package voorbeeldenWrapperklasse;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Opdracht8 {

	public static void main(String[] args) {
		LocalDate gebDat = LocalDate.of(1995, 2, 17);
		LocalDate nu = LocalDate.now();
		Period tussen = Period.between(gebDat, nu);
		System.out.println(tussen.getYears()+" jaar "+ tussen.getMonths() + " maand" + tussen.getDays()+ "dagen");
		System.out.println(ChronoUnit.MONTHS.between(gebDat, nu));

	}

}
