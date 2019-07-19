package be.pxl.h5.exeoef16;

import java.util.Scanner;

public class Exeoef16extra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lengte;
		int hoogte;
		System.out.println("geef de hoogte van het vierkant in");
		hoogte = input.nextInt();
		System.out.println("geef de lengte van het vierkant in");
		lengte = input.nextInt();
		for (int i = 1; i <= hoogte; i++) {
			for (int j = 1; j <= lengte; j++) {
				if (i == 1 || i == hoogte) {
					System.out.print("* ");
				} else {

					if (j == 1 || j == lengte) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}

			}
			System.out.println("");
		}

		input.close();

	}

}
