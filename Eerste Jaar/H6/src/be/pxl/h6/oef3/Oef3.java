package be.pxl.h6.oef3;

import java.util.Scanner;

public class Oef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String txt;
		String test;
		txt = input.nextLine();
		int len = txt.length();
		test = "";
		for (int i = len -1; i >=0; i--)
		{
			test = test + txt.charAt(i);
			
		}
		System.out.println(test);
	
		input.close();
	}

}
