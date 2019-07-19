package be.pxl.h5.exeoef14;

import java.util.Scanner;

public class Exeoef14 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int gesl;
		 double afgKm;
		 double res;
		 int totm;
		 totm =0;
		 int ms;
		 int vs;
		 ms =0;
		 vs =0;
		 int totv;
		 totv = 0;
		 double eindv;
		 double eindm;
		 eindm =0;
		 System.out.println("typ 1 voor man of 2 voor vrouw");
		 gesl = input.nextInt();
		 eindv =0;
		 while(gesl ==1 || gesl ==2)
		 {
			 System.out.println("geef de afgelopen kilometers in");
			 afgKm = input.nextDouble();
			 res = ((afgKm*1000-504.9)/44.73);
			if(gesl ==1)
			{
				totm++;
				if(res < 36)
				{
				ms++;
				}
			}
			else{
				totv++;
				if(res < 29)
				{
					vs++;
				}
			}
			eindm=(double)ms/totm*100.0;
			eindv=(double)vs/totv*100.0;
			 System.out.println("typ 1 voor man of 2 voor vrouw");
			 gesl = input.nextInt();
			 
		 }
		 System.out.println("de mannen met een slechte conditie is" + eindm + "% en de vrouwen met een slechte conditie zijn" + eindv +"%");
		 
		 
		 
		 input.close();
	}

}
