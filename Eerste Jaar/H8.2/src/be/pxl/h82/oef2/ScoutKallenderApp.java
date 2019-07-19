package be.pxl.h82.oef2;

import java.util.Scanner;

public class ScoutKallenderApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maand;
		int jaar;
		int teller=0;
		int [] dag = new int [2];
		String [] activiteit =new String [2];
		
		
		
		Datum d1 = new Datum();
		Datum[] lijst= {d1};
		lijst[0] = d1;
		
		
		
		System.out.println("geef een maandnummer in");
		maand= input.nextInt();
		d1.setMaand(maand);
		System.out.println("geef een jaar in");
		jaar = input.nextInt();
		d1.setJaar(jaar);
		System.out.println("geef een dag in");
		dag[0] = input.nextInt();
		System.out.println("geef een activiteit in");
		activiteit[teller] = input.next();
		Datum [] dat = new Datum [2];
		dat [2] = new Datum (maand,jaar,dag[teller]);
		while(dag[teller] != 0){
			teller++;
			System.out.println("geef een dag in");
			dag[teller] = input.nextInt();
			System.out.println("geef een activiteit in");
			activiteit[teller] = input.next();
			System.out.println(dag[teller]);
			
			
		}
		System.out.println("**** Kalender voor " + dat[teller].getMaand() + " " + jaar);
		for (int i = 0; i < teller; i++) {
			dat[i].print();
			if (dat[i].getDag() < 2) {
				System.out.println("\t\t" + activiteit[i]);
			} else {
				System.out.println("\t" + activiteit[i]);
			}
		}
		input.close();

		}
		
		
	
	
		
		
		
	
	}


