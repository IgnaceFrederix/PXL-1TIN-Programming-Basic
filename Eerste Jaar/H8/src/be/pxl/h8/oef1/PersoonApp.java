package be.pxl.h8.oef1;

import java.util.Scanner;

public class PersoonApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Persoon pers = new Persoon();
		Persoon pers2 = new Persoon();
		Persoon pers3 = pers;
		
		pers.setVoornaam("voornaam");
		pers.setNaam("naamtest");
		pers.voegVoornamenToe("test");
		pers.setGewicht(50);
		pers.setLengte(8);
		pers.setGeboortejaar(1995);
		//pers.print();
		//pers.printBMI();
	//	pers.getLeeftijd();
		//pers.grow();
		//pers.grow(20);
	
		//pers3.printBMI();
		
	
		System.out.println(pers.getVoornaam());
		input.close();
		
	}
}
