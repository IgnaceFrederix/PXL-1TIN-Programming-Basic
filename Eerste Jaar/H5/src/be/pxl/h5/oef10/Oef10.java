package be.pxl.h5.oef10;

import java.util.Scanner;

public class Oef10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jaarwedde;
		int beoordeeling;
		double vast;
		System.out.println("geef een jaarwedde in");
		jaarwedde = input.nextInt();
		System.out.println("1 = 0 2 = 10 3 = 20 4 = 30");
		beoordeeling = input.nextInt();
		vast = jaarwedde * 0.05;
		
		if (beoordeeling == 1) {
			vast = jaarwedde * 0.05;
		} else {
			if (beoordeeling == 2) {
				vast = vast * 1.1;
				
			} else {
				if (beoordeeling == 3) {
					vast = vast * 1.2;
					
				} else {
					vast = vast * 1.3;
					
				}
				
			}
			
		}
		System.out.println("de premie is" +vast);
		input.close();
	}

}
