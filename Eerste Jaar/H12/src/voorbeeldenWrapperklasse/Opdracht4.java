package voorbeeldenWrapperklasse;

import java.time.Instant;
import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Instant voor = Instant.now();
		System.out.println("geef naam en voornaa min");
		String naam = keyboard.next();
		Instant na = Instant.now();
		long sec = na.getEpochSecond() - voor.getEpochSecond();
		System.out.println("het ingegeven van naam en voornaam duurde " + sec+ "seconde");
		keyboard.close();

	}

}
