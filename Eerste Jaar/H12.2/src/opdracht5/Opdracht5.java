package opdracht5;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef een dag in 1-7");
		int dagnummer = input.nextInt();
		System.out.println("geef een positief geheeld getal in");
		int extra = input.nextInt();
		DayOfWeek[] dagen = DayOfWeek.values();
		DayOfWeek dag = dagen[dagnummer-1];
		DayOfWeek dagExtra = dag.plus(extra);
		System.out.println("Ingegeven dag"+dag);
		System.out.println(extra + "dagen later is "+  dagExtra);
		Locale lokaal = Locale.getDefault();
		System.out.println("Ingegeven dag"+dag.getDisplayName(TextStyle.FULL, lokaal));
		System.out.println(extra + "dagen later is "+  dagExtra);	
		
		input.close();

	}

}
