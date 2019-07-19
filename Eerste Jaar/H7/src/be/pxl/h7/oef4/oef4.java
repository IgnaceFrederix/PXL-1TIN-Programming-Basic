package be.pxl.h7.oef4;

import java.util.Scanner;

public class oef4 {

	public static void main(String[] args) {
		int keuze;
		int an;
		int bart;
		int andries;
		int inge;
		an =0;
		bart = 0;
		andries =0;
		inge =0;
		double totaal;
		Scanner input = new Scanner(System.in);
		System.out.println("geef een 1 2 3 of 4 in");
		keuze =input.nextInt();
		totaal =0;
		while(keuze != 0){
			switch(keuze)
			{
			
			case 1: an++;break;
			case 2: bart++;break;
			case 3: andries++;break;
			case 4: inge++;break;
			}
			totaal++;
			System.out.println("geef een 1 2 3 of 4 in");
			keuze =input.nextInt();
		}
		System.out.println("an"+an + "percnetage"+(an/totaal)*100);
		System.out.println("bart"+bart + "percnetage"+(bart/totaal)*100);
		System.out.println("andries"+andries+ "percnetage"+(andries/totaal)*100);
		System.out.println("inge"+inge+ "percnetage"+(inge/totaal)*100);

			
			
			input.close();
	}

}
