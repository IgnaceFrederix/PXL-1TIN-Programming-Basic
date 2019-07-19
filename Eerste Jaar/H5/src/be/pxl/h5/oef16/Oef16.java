package be.pxl.h5.oef16;

import java.util.Scanner;

public class Oef16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sec;
		int nummer;
		int min;
		min = 1000000000;
		int minnummer;
		minnummer = 0;
		nummer =1;
		int uur;
		uur = 0;
		int aantal;
		aantal = 0;
		System.out.println("geen een nummer in");
		nummer = input.nextInt();
		while(nummer > 0)
		{
			
			System.out.println("geef een tijd in");
			sec = input.nextInt();
			aantal = aantal+1;
			
			if(sec > 3600)
			{
				uur = uur+1;
			}
			if(sec < min)
			{
				min = sec;
				minnummer = nummer;
			}
			System.out.println("geen een nummer in");
			nummer = input.nextInt();
			
			
		}
		
		System.out.println(minnummer);
		System.out.println((uur*100.0/aantal));
		System.out.println("de uren zijn" + (min/3600) + "minuten " + ((min%3600)/60) + "de seconde" + (((min%3600)/60)%60));
		input.close();

	}

}
