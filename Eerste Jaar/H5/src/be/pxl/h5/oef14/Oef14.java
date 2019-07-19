package be.pxl.h5.oef14;

import java.util.Scanner;

public class Oef14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int artikelnummer;
		int hoeveelheid;
		double eenheid;
		double totaalprijs;
		totaalprijs =0;
		double eindprijs;
		eindprijs = 0;
		System.out.println("geef een artikelnummer in");
		artikelnummer = input.nextInt();
		
		while(artikelnummer != 999)
		{
			System.out.println("geef een hoeveelheid in");
			hoeveelheid = input.nextInt();
			System.out.println("geef een einheiodsprijs in");
			eenheid = input.nextDouble();
		
			totaalprijs = eenheid*hoeveelheid;
			eindprijs = totaalprijs + eindprijs;
			System.out.println("het artikelnummer is " + artikelnummer);
			System.out.println("de hoeveelheid is " +hoeveelheid);
			System.out.println("de eenheidsprijs is " +eenheid);
			System.out.println("de totaal is " + eenheid*hoeveelheid);
			System.out.println("geef een volgend artikelnummer in");
			artikelnummer = input.nextInt();
			
		}
		System.out.println(eindprijs);
	
		input.close();

	}

}
