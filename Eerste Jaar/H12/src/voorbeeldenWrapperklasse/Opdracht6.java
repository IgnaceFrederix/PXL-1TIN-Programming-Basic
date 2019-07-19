package voorbeeldenWrapperklasse;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		LocalDate gebDat = LocalDate.of(1996, 5, 12);
		System.out.println("Geboren op " + gebDat.getDayOfWeek());
		System.out.println("Geboren op " + gebDat.getDayOfYear());
		System.out.println("was het een scrikkeljaar " + gebDat.isLeapYear());
		

	}

}
