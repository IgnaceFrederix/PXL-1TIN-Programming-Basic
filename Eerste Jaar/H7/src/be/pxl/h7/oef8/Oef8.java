package be.pxl.h7.oef8;

import java.util.Scanner;

public class Oef8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String naam;
		String voornaam;
		int gmaand;
		int gdag;
		String deel1, deel2;
		String [] ster ={"steenbok","waterman","vissen","ram","stier","tweelingen","kreeft","leeuw","maagd","weegschaal","schorpioen","boogschutter","steenbok",};
		
		StringBuilder tekst1 = new StringBuilder();
		String sterb;
		sterb ="";
		System.out.println("geef een naam in");
		naam = input.nextLine();
		while(naam != "/")
		{	
			System.out.println("geef een voornaam in");
			voornaam = input.nextLine();
			
			System.out.println("geef uw geboortez maand in");
			gmaand = input.nextInt();
			System.out.println("geef uw geboortedag in");
			gdag = input.nextInt();
			if(gdag < 21)
			{
				gmaand = gmaand-1;
			}
			for(int i = gmaand; i < ster.length; i++)
			{
				if(gmaand == i)
				{
					sterb = ster[i];
				}
			}
			deel1 = voornaam.charAt(0)+"";
			deel1 = deel1.toUpperCase();
			deel2 = naam.toUpperCase();
			tekst1.append(deel1).append(".").append(deel2).append(" ").append(sterb);
			System.out.println(tekst1);
			System.out.println("geef een naam in");
			naam = input.nextLine();
			input.nextLine();
			
		}
		input.close();
	}

}


