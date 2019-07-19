package be.pxl.h5.oef5;

import java.util.Scanner;

public class Oef5 {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int bedrag, aantal, rest;
		 System.out.println("geef een bedrag in");
		 bedrag = input.nextInt();
		 aantal = bedrag/20;
		 rest = bedrag%20;
		 System.out.println("het bedrag is " + aantal + " briefjes van 20. " + rest + " euro aan rest dus minder dan 20 ");
		 input.close();
	}

}
