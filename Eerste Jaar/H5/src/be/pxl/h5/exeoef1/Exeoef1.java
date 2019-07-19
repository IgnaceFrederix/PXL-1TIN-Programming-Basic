package be.pxl.h5.exeoef1;

import java.util.Scanner;

public class Exeoef1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		double F;
		int C;
		System.out.println("geef de graden celsicus in");
		 C = input.nextInt();
		 F = (9.0/5.0)*C +32;
		 System.out.println("de temeratuur in F is " + F);
		input.close();
	}

}
