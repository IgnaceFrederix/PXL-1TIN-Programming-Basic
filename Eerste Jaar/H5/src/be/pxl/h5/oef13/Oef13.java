package be.pxl.h5.oef13;

import java.util.Scanner;

public class Oef13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;
		System.out.println("geef een getal tussen 0 en 100");
		getal = input.nextInt();
		while(getal < 0  || getal > 101)
		{
			if(getal < 0)
			{
				System.out.println("het getal is kleinder dan 0 uw getal is" + getal);
			}
			else{
				System.out.println("het getal is groter dan 100 uw getal is" + getal);
			}
			getal = input.nextInt();
			
		
		}
		System.out.println("het getal ligt tussen 0 en 100 uw getal is " + getal);
		
		input.close();
	}

}
