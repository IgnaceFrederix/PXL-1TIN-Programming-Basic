package be.pxl.h7.oef3;

import java.util.Scanner;

public class Oef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int get, posa = 0, nega = 10000, klein = 0;
		int [] pos = new int[10];
		int [] neg = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Geef een getal in");
			get = input.nextInt();
			if (get >= 0){
				pos[posa] = get;
				posa++;
			}else{
				neg[nega] = get;
				nega++;
			}
		}
		
		for (int i = 0; i < posa; i++) {
			System.out.print(pos[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < nega; i++) {
			System.out.print(neg[i] + " ");
			if (klein > neg[i]){
				klein = neg[i];
			}
		}
		System.out.println("\nDit is et kleinste getal" + klein);
		
		input.close();
	}

}
