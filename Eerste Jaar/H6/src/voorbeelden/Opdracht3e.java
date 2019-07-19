package voorbeelden;

import java.util.Scanner;

public class Opdracht3e {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder naam = new StringBuilder();
		System.out.println("geef een achternaam in");
		String achter = input.next();
		System.out.println("geef de voornaam");
		String voor = input.next();
		String deel1, deel2, deel3;
		deel1 = voor.charAt(0)+"";
		deel1 = deel1.toUpperCase();
		deel2 = achter.charAt(0)+"";
		deel2 = deel2.toUpperCase();
		deel3 = achter.substring(1);
		deel3 = deel3.toLowerCase();
		naam = naam.append(deel1).append(".").append(deel2).append(deel3);
		System.out.println(naam);
		
		input.close();

	}

}
