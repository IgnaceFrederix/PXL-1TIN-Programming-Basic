package be.pxl.h7.oef4;

import java.util.Scanner;

public class Oef4array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef een 1 2 3 of 4 in");
		int [] stem = new int [5];
		int code;
		double totaal =0;
		code = input.nextInt();
		while(code != 0){
			stem[code]=stem[code]+1;
			System.out.println("geef een 1 2 3 of 4 in");
			code = input.nextInt();	
			}
	totaal = stem[1]+stem[2]+stem[3]+stem[4];
		System.out.printf("%d %5.1f \n", stem[1],(stem[1]/totaal)*100);
		System.out.printf("%d %5.1f \n", stem[2],(stem[2]/totaal)*100);
		System.out.printf("%d %5.1f \n", stem[3],(stem[3]/totaal)*100);
		System.out.printf("%d %5.1f \n", stem[4],(stem[4]/totaal)*100);
		
		System.out.printf("%5.0f" ,totaal);
		
		input.close();	
		

	}

}
