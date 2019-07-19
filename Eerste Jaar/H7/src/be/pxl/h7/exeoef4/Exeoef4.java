package be.pxl.h7.exeoef4;

import java.util.Scanner;

public class Exeoef4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal [][] = new int[4][3];
		
		int somgetal;
		somgetal=0;
		
		for(int j =0; j < getal[0].length; j++)//de nul zorgt er voor dat je de tweede lengte van een array pakt
		{
			System.out.println("geef de getallen van kollom "+ (j+1)+" in");
			for(int i =0; i < getal.length; i++)
			{
				System.out.println("geef een getal in");
				getal[i][j] = input.nextInt();
			}
		}
		for(int i =0; i < getal.length; i++)
		{
			somgetal=0;
			for(int j =0; j < getal[i].length; j++)
			{
				somgetal = somgetal+getal[i][j];
			}
			System.out.println(somgetal);
		}
		input.close();
	}
}
