package oef2;


import java.util.Arrays;
import java.util.Collections;

public class KaartApp {

	public static void main(String[] args) {
		int teller = 0;
		Kaart[] kaarten = new Kaart[52];
		for (Soort soort : Soort.values()) {
			for (Ranking rank : Ranking.values()) {
				kaarten[teller] = new Kaart(rank, soort);
				teller++;
			}
		}
		Collections.shuffle(Arrays.asList(kaarten));
		
		//Indien je zonder uitbreiding wilt gewoon de code uit de while lus halen
		//en de boolean verwijderen
		Boolean spelerWinnaar = false;		
		while (!spelerWinnaar) {
			Kaart spelerKaart = kaarten[(int) (Math.random() * 52)];
			Kaart computerKaart = kaarten[(int) (Math.random() * 52)];
			
			if (spelerKaart.getRank().ordinal() > computerKaart.getRank().ordinal()) {
				spelerWinnaar = true;
				System.out.println("Winnaar speler " + spelerKaart.toString());
				System.out.println("Verliezer computer " + computerKaart.toString());
			} else  if (spelerKaart.getRank().ordinal() == computerKaart.getRank().ordinal()){
				System.out.println("Geen winnaar!!");
			} else {
				System.out.println("Winnaar computer " + computerKaart.toString());
				System.out.println("Verliezer speler " + spelerKaart.toString());
			}
			System.out.println();
		}
	}

}
