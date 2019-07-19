package be.pxl.h5.exeoef6;

import java.util.Scanner;

public class Exeoef6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gram;
		System.out.println("geef het gewiocht van de brief in");
		gram = input.nextInt();

		if (gram <= 20) {
			System.out.println("het te betalen bedrag is 0.3 euro");
		} else {
			if (gram <= 50) {
				System.out.println("het te betalen bedrag is 0.5 euro");
			} else {
				if (gram <= 150) {
					System.out.println("het te betalen bedrag is 0.7 euro");
				} else {
					if (gram <= 250) {
						System.out.println("het te betalen bedrag is 1.0 euro");
					} else {
						System.out.println("het te betalen bedrag is 1.9 euro");
					}
				}
			}
		}

		input.close();

	}

}
