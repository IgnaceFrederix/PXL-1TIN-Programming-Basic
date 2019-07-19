package be.pxl.h5.exeoef16;

import java.util.Scanner;

public class Exeoef16 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int lengte;
		 int hoogte;
		 System.out.println("geef de hoogte van het vierkant in");
		 hoogte = input.nextInt();
		 System.out.println("geef de lengte van het vierkant in");
		 lengte = input.nextInt();
		for (int i =0; i < hoogte; i++)
		{
			for(int j =0; j< lengte; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
			
			input.close();

	}

}
