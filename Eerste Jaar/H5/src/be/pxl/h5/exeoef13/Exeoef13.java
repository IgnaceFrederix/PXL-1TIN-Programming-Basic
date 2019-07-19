package be.pxl.h5.exeoef13;

import java.util.Scanner;

public class Exeoef13 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double begin;
		 double eind;
		 int jaren;
		 double intrest;
		 double test;
		 eind =0;
		 double totaal;
		 System.out.println("geef de jaren in");
		 jaren = input.nextInt();
		 System.out.println("geef de intrest in");
		 intrest = input.nextDouble();
		 System.out.println("geef het begin bedrag in");
		 begin = input.nextDouble();
		 
		 totaal=begin;
		 for ( int i = 0; i < jaren; i++)
		 {
			 totaal = totaal*(intrest/100);
			 totaal = begin+totaal;
		 }
		
		// totaal = (begin* (Math.pow((1+(intrest/100)),jaren)));
		for(int i = 0; i < jaren; i++)
		{
			test = begin*(1+(intrest/100) );
			eind = test -begin;
			begin = begin+eind;
			
			System.out.println(eind);
		}
		System.out.println(totaal);
		 
		 input.close();

	}

}
