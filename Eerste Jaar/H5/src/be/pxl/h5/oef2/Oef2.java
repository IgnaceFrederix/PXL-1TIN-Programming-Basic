package be.pxl.h5.oef2;

import java.util.Scanner;

public class Oef2 {
	  
	  public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  int aantalproducten;
		  double totaalbedragex;
		  double totaalbedraginc;
		  System.out.println("geef het aantal producten in");
		  aantalproducten = input.nextInt();
		  totaalbedragex = (11.5*aantalproducten);
		  totaalbedraginc = (totaalbedragex*1.21);
		  System.out.println("het te betalen bedrag zonder btw is " + totaalbedragex +" en het bedrag met btw is " + totaalbedraginc);
		  input.close();
		  
}
}
