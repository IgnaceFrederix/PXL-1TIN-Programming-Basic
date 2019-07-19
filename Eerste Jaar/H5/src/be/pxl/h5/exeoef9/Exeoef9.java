package be.pxl.h5.exeoef9;

import java.util.Scanner;

public class Exeoef9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bdag, bmaand, bjaar, nudag, numaand, nujaar, leeftijd;
		System.out.println("geef de dag waar je op geboren bent");
		bdag = input.nextInt();
		System.out.println("geef de maand in waar je op geboren bent");
		bmaand = input.nextInt();
		System.out.println("geef het jaar in waar je in geboren bent");
		bjaar = input.nextInt();
		System.out.println("geef de dag van vandaag in");
		nudag = input.nextInt();
		System.out.println("geef de maand van nu in");
		numaand = input.nextInt();
		System.out.println("geef het huidige jaar in");
		nujaar = input.nextInt();
		leeftijd = nujaar-bjaar;
		if(numaand <= bmaand )
		{
			if(nudag <= bdag -1)
			{
				System.out.println("de leeftijd van u is " + (leeftijd -1));
			}
			else{
				System.out.println("de leeftijd van u is " + (leeftijd));
			}
		
		}else{
			System.out.println("de leeftijd van is " + leeftijd);
			
		}
		
		input.close();
	}

}
