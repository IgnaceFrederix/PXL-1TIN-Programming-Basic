package be.pxl.h5.oef7;

import java.util.Scanner;

public class Oef7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int km;
		double kost;
		int soort;
		System.out.println("geef de kilomets van de vlucht in");
		km =input.nextInt();
		System.out.println("1 = tourist 2 = char 3 = zakenreis");
		soort = input.nextInt();
		if(km < 1000){
			kost = 25*km; 
		}else{
			if(km <= 2999)
			{
				kost = 20*km;
			}
			else{
				kost = 12*km;
			}
		}
		
		if (soort == 1)
		{
			kost = kost/100;
		}else{
			if(soort == 2)
			{
				kost = kost/100*0.8;
			}else
			{
				kost = kost/100*1.3;
			}
		}
		kost = (int) kost;
		System.out.println("het te betalenbedrag is " + kost);
		
		input.close();
	}

}
