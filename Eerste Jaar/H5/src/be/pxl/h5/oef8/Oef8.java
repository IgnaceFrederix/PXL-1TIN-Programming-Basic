package be.pxl.h5.oef8;

import java.util.Scanner;

public class Oef8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int examen1;
		int examen2;
		int examen3;
		double totaalpunt;
		System.out.println("geef het eerste punt in");
		examen1 = input.nextInt();
		System.out.println("geef het tweede punt in");
		examen2 = input.nextInt();
		System.out.println("geef het derde punt in");
		examen3 = input.nextInt();
		totaalpunt = (examen1 + examen2 + examen3)/60.0*100;
		if (totaalpunt < 60){
			System.out.println("onvoldoende");
		}else{
			if(totaalpunt < 70){
				System.out.println("voldoende");
			}else{
				if(totaalpunt < 80){
					System.out.println("onderscheiding");
				}else{
					if(totaalpunt < 90)
					{
						System.out.println("grote onderscheiding");
					}
					else{
						System.out.println("grootste ondersceiding");
					}
				}
			}
		}
		
		input.close();
	}

}
