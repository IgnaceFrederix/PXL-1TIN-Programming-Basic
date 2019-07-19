package be.pxl.h5.oef18;

import java.util.Scanner;

public class Oef18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int getal;
		System.out.println("geef een getal in");
		getal = input.nextInt();
		while(getal != 0)
		{
			
			for(int i =1; i <= getal-1; i++  )
			{
				System.out.print(i+"*");
			}
			System.out.print(getal);
			System.out.print("=" +getal);
			System.out.println("\t");
			System.out.println("geef een getal in");
			getal = input.nextInt();
				
		}	
			input.close();

	}

}
