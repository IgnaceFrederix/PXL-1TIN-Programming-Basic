package be.pxl.h5.oef19;

import java.util.Scanner;

public class Oef19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lengte;
		lengte = input.nextInt();
	
		 for (int getal = lengte; getal >= 0; getal--) {
			 
		 
		for(int i = 0; i< getal ; i++)
		{
			System.out.print("@");
			
		}
		System.out.println();
		 }
		
		input.close();
	}

}
