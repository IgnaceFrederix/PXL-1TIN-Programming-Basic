package be.pxl.h5.oef4;

import java.util.Scanner;

public class Oef4 {
	 
	  
	  public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  int seconde;
		  int uren;
		  int restuur;
		  System.out.println("geef het aantal seconde in");
		  seconde = input.nextInt();
		  uren = seconde /3600;
		   restuur = seconde% 3600; 
		  System.out.print(uren + " uren " );
		  System.out.print((restuur)/60 + " minuten ");
		  System.out.print(seconde%60 +"seconde");
		  input.close();
	  }
	

}
