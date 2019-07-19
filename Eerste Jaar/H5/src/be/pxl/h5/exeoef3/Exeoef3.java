package be.pxl.h5.exeoef3;

import java.util.Scanner;

public class Exeoef3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		double	l;
		double	b;	
		double d;
		double oppervlakte;
		int water;
		int onstemetting;
		System.out.println("geef de lengte van het zwembad");
		 l = input.nextDouble();
		 System.out.println("geef de breete van het zwembad");
		 b = input.nextDouble();
		 System.out.println("geef de diepte van het zwembad");
		 d = input.nextDouble();
		 oppervlakte = (l * b * d)*1000;
		 water =(int)(oppervlakte*0.98);
		 onstemetting = (int) (oppervlakte*0.02);
		 System.out.println("het water dat nodig is " +water);
		 System.out.println("het onsmettingsmiddel dat nodig is " +onstemetting);
		 input.close();
	}
	

}
