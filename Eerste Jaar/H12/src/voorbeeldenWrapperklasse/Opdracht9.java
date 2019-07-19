package voorbeeldenWrapperklasse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opdracht9 {

	public static void main(String[] args) {
		DateTimeFormatter opmaakIn = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner keyboard = new Scanner (System.in);
		System.out.println("geef Datum in ");
		String datum = keyboard.next();
		LocalDate d = LocalDate.parse(datum, opmaakIn);
		DateTimeFormatter opmaakUit = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(opmaakUit.format(d));
		keyboard.close();

	}

}
