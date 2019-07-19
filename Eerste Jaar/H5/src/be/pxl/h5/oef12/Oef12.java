package be.pxl.h5.oef12;

import java.util.Scanner;

public class Oef12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double maan;
		double jupiter;
		double mars;
		System.out.println("geef het gewicht persentage van de maan op");
		maan = input.nextDouble();
		System.out.println("geef het gewichts percentage van jupiter op");
		jupiter = input.nextDouble();
		System.out.println("geef het gewichts percentage van mars op");
		mars = input.nextDouble();
		for( int i =50; i <= 120; i=i+5)
		{
			System.out.print(i);
			System.out.print(" het gewicht op de maan ");
			System.out.print(i*maan);
			System.out.print(" het gewicht op jupiter ");
			System.out.print( i*jupiter);
			System.out.print(" het gewicht op mars ");
			System.out.println(i*mars);
			
		}
		
		
		input.close();

	}

}
