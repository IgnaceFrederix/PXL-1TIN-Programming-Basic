package be.pxl.h82.oef3;

import java.util.Random;
import java.util.Scanner;

public class Klasse3 {
	public static void main(String[] args) {
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	int x;
	int y;
	double getal;
	double getal2;
	
	y = rand.nextInt(6000001);
	 getal2 = y/1000.0;
	System.out.println("geef een getal in");
	x = input.nextInt();
	getal = (Math.pow(x, 2)+ Math.pow(getal2, 3));
	getal = Math.sqrt(getal);
	getal = getal*Math.E;
	
	System.out.printf("%.3f" ,getal);
	System.out.println("");
	System.out.println(Math.E);
	
	input.close();
	
	
}
}
