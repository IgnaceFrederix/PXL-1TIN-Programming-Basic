package be.pxl.h7.exeoef2;

import java.util.Scanner;

public class Exeoef2m {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int saldo=0;
		System.out.println("geef de klascode in");
		String klascode = keyboard.next();
		System.out.println("geef het betaalde voorschot in");
		int voorschot = keyboard.nextInt();
		System.out.println("geef het aantal Studenten in");
		int aantal = keyboard.nextInt();
		
		int [] studenten = new int [aantal];
		int [] betalen = new int [aantal];
		
		System.out.println("geef het student Nummer in");
		int nummer = keyboard.nextInt();
		
		while(nummer !=0 && nummer<=studenten.length){
			System.out.println("geef de onkosten in voor deze student");
			int onkosten = keyboard.nextInt();
			
			betalen[nummer-1] = betalen[nummer-1]+onkosten;
			studenten[nummer-1] = nummer;
			System.out.println("geef het student Nummer in");
			nummer = keyboard.nextInt();
		}
		
		for(int i=0;i<studenten.length;i++){
			
			saldo = betalen[i]-voorschot;
			System.out.printf("de klascode: %s het student nummer: %d de onkosten: %d het saldo: %d %n", klascode , studenten[i], betalen[i] ,saldo );
		}
		keyboard.close();

	}
}
