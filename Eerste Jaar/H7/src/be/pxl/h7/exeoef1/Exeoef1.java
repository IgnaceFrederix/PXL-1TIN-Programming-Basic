package be.pxl.h7.exeoef1;

import java.util.Scanner;

public class Exeoef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("hoeveel getallen wilt u ingeven");
		n = input.nextInt();
		int [] a = new int [n];
		for(int i =0; i < n; i++)
		{
			System.out.println("geef een getal in");
			a[i] = input.nextInt();
		}
		int hulp = a[0];
		for(int i =0; i < n-1;i++)
		{
			a[i] = a[i+1];
		}
		a[n-1] = hulp;
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			
		}
		input.close();
	}

}
