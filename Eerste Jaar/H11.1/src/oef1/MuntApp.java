package oef1;

import java.util.Scanner;

public class MuntApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een bedrag tussen 0 en 10 euro in om te wisselen in kleingeld: ");
		double bedrag = keyboard.nextDouble();
		while (bedrag < 0 || bedrag > 10) {
			System.out.println("Geef een bedrag tussen 0 en 10 euro in: ");
			bedrag = ((int) (keyboard.nextDouble() * 100) / 100.0);
		}
		keyboard.close();

		Double bewerktBedrag = bedrag * 100;

		for (Munt munt : Munt.values()) {
			if (bewerktBedrag / munt.getWaarde() >= 1) {
				System.out.printf("Je hebt %d stuk(ken) van %s nodig\n", (int) (bewerktBedrag / munt.getWaarde()),
						munt.toString());
				bewerktBedrag %= munt.getWaarde();
			}
		}
	}

}
