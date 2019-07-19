package be.pxl.h7.oef1;

import java.util.Scanner;

public class Oef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] nummer = new int [16];
		double gem;
		gem = 0;
		int test;
		test = 0;
		for(int i = 0; i <nummer.length; i++)
		{
			System.out.println("geef een getal in");
			nummer[i] = input.nextInt();
			gem = gem +nummer[i];
		}
		gem =gem/16;
		for (int get : nummer){
			System.out.println(get +" ");
			for(int get2 : nummer)
			{
				if(get2 < gem)
				{
					test++;
				}
			}
		}
		System.out.println(gem);
		System.out.println(test);
		input.close();
	}

}
