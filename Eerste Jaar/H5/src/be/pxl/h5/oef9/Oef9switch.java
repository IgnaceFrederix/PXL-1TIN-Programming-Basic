package be.pxl.h5.oef9;

import java.util.Scanner;

public class Oef9switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int soortcode;
		System.out.println("geef een eerste getal in");
		a = input.nextInt();
		System.out.println("geef een tweede getal in");
		b = input.nextInt();
		System.out.println("1 = + 2 = - 3 = * 4 = kwadraad eerste getal 5 =  kwadraad tweede getal");
		soortcode = input.nextInt();
		switch(soortcode){
		case 1 : c = a + b;
		System.out.println("de uitkomst is " + c);
		break;
	
		case 2: c = a - b;
		System.out.println("de uitkomst is " + c);
		break;
		
		case 3: c = a * b;
		System.out.println("de uitkomst is " + c);
		break;
		case 4: c = a * a;
		System.out.println("de uitkomst is " + c);
		break;
		case 5 : c = b * b;
		System.out.println("de uitkomst is " + c);
		break;
		default : System.out.println("de foute code is ingegeven");
		}
		
		
		input.close();

	}

}
