package be.pxl.h6.exeoef2;

import java.util.Scanner;

public class Exeoef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tekst;
		System.out.println("geef een tekst in");
		tekst = input.nextLine();
		if(tekst.length()%3 ==0)
		{
			tekst = tekst.toUpperCase();
		}else{
			tekst = tekst.toLowerCase();
		}
		System.out.println(tekst);

		
		
		input.close();
	}

}
