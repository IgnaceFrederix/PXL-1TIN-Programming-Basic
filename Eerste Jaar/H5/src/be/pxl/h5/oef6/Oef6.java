package be.pxl.h5.oef6;

import java.util.Scanner;

public class Oef6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aantal;
		double totaalprijs;
		System.out.println("geef een aantal van de producten af");
		aantal = input.nextInt();
		totaalprijs = ((11.5*aantal)*1.21);
		if(totaalprijs > 1000){
			totaalprijs = totaalprijs*0.9;
		}
		System.out.println("het te betalen bedrag is" + totaalprijs);
		
		input.close();
	}

}
