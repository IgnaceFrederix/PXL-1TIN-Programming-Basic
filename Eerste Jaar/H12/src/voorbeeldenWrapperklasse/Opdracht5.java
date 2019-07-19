package voorbeeldenWrapperklasse;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("geef een dag van de week in 1-7");
		int dag = keyboard.nextInt();
		System.out.println("geef aantal dage om erbij io te tellen");
		int extra = keyboard.nextInt();
		DayOfWeek dag1 = DayOfWeek.of(dag);
		DayOfWeek dag2 = dag1.plus(extra);
		System.out.println(dag1);
		System.out.println(extra +" dagen later is het " + dag2);
		Locale lokaal = Locale.getDefault();
		System.out.println(dag1.getDisplayName(TextStyle.FULL, lokaal));
		System.out.println(extra + "dagen later is het " + dag2.getDisplayName(TextStyle.SHORT, lokaal));
				
		keyboard.close();

	}

}
