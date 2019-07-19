package be.pxl.h6.oef2;

import java.util.Scanner;

public class Oef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef een lijn");
		String txt = input.nextLine();
		int len = txt.length();
		String deel1, deel2;
		int pos =txt.indexOf("t");
		int pos2 = txt.indexOf("T");
		if(pos != -1 || pos2 != -1)
		{
			deel1 = txt.charAt(pos)+"";
			deel1 = txt.substring(0,pos);
			deel2 = txt.substring(pos,len);
				if(len%2 ==0)
				{
					deel2 = deel2.toLowerCase();
					
				}else{
					
					deel2 = deel2.toUpperCase();
					
				}
				System.out.println(deel1+deel2);
		}else{
			System.out.println("gelieve een lijn in te voegen met een t");
		}
		
		input.close();
	}

	}


