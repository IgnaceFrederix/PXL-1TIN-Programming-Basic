package oef1;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class FormatterApp {

	public static void main(String[] args) {
		try{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter a date in this format: DD/MM/YYYY");
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.next();
		LocalDate d = LocalDate.parse(date, formatter);
		System.out.println(formatter2.format(d));
		}
		catch(DateTimeParseException ex){
			System.out.println("eris een verkeerde ingave gedaan ");
		}
	}
}

