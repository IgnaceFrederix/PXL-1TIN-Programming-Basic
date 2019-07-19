package be.pxl.h5.oef11;

import java.util.Scanner;

public class Oef11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;
		int som = 0;
		int neg = 0;
		System.out.println("geef een getal in");
		getal = input.nextInt();
		while(getal !=0)
		{
			som += getal;
			
			
			if(getal< 0){
				neg++;
			}
			System.out.println("geef een getal in");
			getal = input.nextInt();
			
		}
		System.out.println(som -1);
		System.out.println(neg);
		
		input.close();

	}

}
