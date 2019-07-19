package be.pxl.h6.exeoef1;

import java.util.Random;
import java.util.Scanner;

public class Exeoef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int teller;
		teller =0;
		Random rand = new Random();
		int getal, rgetal;
		System.out.println("geef een getal in tussen 1 en 10");
		getal = input.nextInt()+1;
		rgetal = rand.nextInt(10);
		while (teller < 4 && rgetal !=getal)
		{
			if(getal < rgetal)
			{
				System.out.println("hoger");
				
			}else{
				System.out.println("lager");
			}
			
			teller++;
			System.out.println("geef een getal in tussen 1 en 10");
			getal = input.nextInt();
		}
		if(rgetal == getal)
		{
			System.out.println("je hebt het getal geraden");
		}else
		{
			System.out.println("je hebt 4 keer geprobeert");
		}
input.close();
	}

}
