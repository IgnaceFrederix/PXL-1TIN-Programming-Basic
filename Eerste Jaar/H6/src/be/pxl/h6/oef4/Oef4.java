package be.pxl.h6.oef4;

import java.util.Scanner;

public class Oef4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tekst1 = input.nextLine(); 
		String tekst2=	input.nextLine();
		String txt;
		String nieuw;
		String test;
		if(tekst1.length()>=5)
		{
			System.out.println(tekst1.length());
			nieuw = tekst1.substring(0,4);
			nieuw = nieuw.toUpperCase();
			
			
		}else{
			nieuw = tekst1.substring(0,tekst1.length());
			nieuw = nieuw.toUpperCase();
			for (int i =tekst1.length() ; i < 4 ; i++)
			{
				nieuw = nieuw+ "*";
			}
		}
		if(tekst2.length() >= 4)
		{
			txt = tekst2.substring(tekst2.length()-4);
			txt = txt.toLowerCase();
		}
		else{
			txt = tekst2.substring(tekst2.length()-tekst2.length(),tekst2.length());
			txt = txt.toLowerCase();
			for (int j =tekst2.length() ; j < 4 ; j++)
			{
				txt = txt+ "+";
			}
		}
		test = nieuw + txt;
		System.out.println(test);
		input.close();

	}

}
