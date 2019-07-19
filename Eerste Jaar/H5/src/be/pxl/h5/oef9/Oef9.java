package be.pxl.h5.oef9;

import java.util.Scanner;

public class Oef9 {

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
		if (soortcode == 1) {
			c = a + b;
			System.out.println("de uitkomst is" + c);
		} else {
			if (soortcode == 2) {
				c = a - b;
				System.out.println("de uitkomst is" + c);
			} else {
				if (soortcode == 3) {
					c = a * b;
					System.out.println("de uitkomst is" + c);
				} else {
					if (soortcode == 4) {
						c = a * a;
						System.out.println("de uitkomst is" + c);
					} else {
						if (soortcode == 5) {
							c = b * b;
							System.out.println("de uitkomst is" + c);
						} else {
							System.out.println("foutive code ingegeven");
						}
					}
				}
			}

		}

		input.close();
	}

}
