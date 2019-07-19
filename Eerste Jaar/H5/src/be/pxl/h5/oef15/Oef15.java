package be.pxl.h5.oef15;

import java.util.Scanner;

public class Oef15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temp;
		int totaaltemp;
		totaaltemp = 0;
		int maxtemp;
		maxtemp =-40;
		
		for(int i =0; i< 10; i++)
		{
			System.out.println("geef de temperatuur in");
			temp = input.nextInt();
			totaaltemp = temp+totaaltemp;
			if(maxtemp < temp)
			{
			maxtemp = temp;
				
			}
			
		}
		System.out.println("de gemiddedle tempeaztuut is" +totaaltemp/10.0);
		System.out.println("de hoogste tempaeratuur is" +maxtemp);
		
		input.close();

	}

}
