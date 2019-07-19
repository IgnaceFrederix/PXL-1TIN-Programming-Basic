package be.pxl.h5.exeoef5;

import java.util.Scanner;

public class Exeoef5 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int getal;
		 int eindgetal;
		 System.out.println("geef een getal in");
		 getal = input.nextInt();
		 eindgetal = getal  % 1000 ;
		 System.out.println( "de laatse 3 cijfers zijn" +eindgetal);
		 input.close();
	}

}
