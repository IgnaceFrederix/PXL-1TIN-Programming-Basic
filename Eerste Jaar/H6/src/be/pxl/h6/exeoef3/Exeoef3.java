package be.pxl.h6.exeoef3;

import java.util.Scanner;

public class Exeoef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder test3 = new StringBuilder();
		String test;
		System.out.println("geef een tekst in die versleuteld moet worden");
		test = input.nextLine();
		int test2;
		
		for(int i =0; i < test.length(); i++)
		{
		test2 = test.charAt(i)+5;
		test3.append((char)test2+"");
		
		}
		System.out.println(test3);
		input.close();
	}

}
