package be.pxl.h7.oef6;

import java.util.Scanner;

public class Oef6r {

	public static void main(String[] args) {
		int points [][] = new int[4][5];
		int laaggetal = 20;
		double gem = 0;
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < points.length; i++) {
			System.out.printf("Geef de punten voor vak %d \t", (i+1));
			System.out.println();
			for (int j = 0; j < points[i].length; j++) {
				System.out.printf("Geef de punten van student %d \t", (j+1));
				points[i][j] = input.nextInt();
			}
		}
		for(int j = 0; j < points[0].length; j++){
			for(int i = 0; i < points.length; i++){
				System.out.printf("%2d  " , points[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < points.length; i++){
		for(int j = 0; j < points.length; j++){
		
			
			if(laaggetal > points[i][j])
			{
				laaggetal = points[i][j];
			}
			
			
		}
		System.out.printf(" Laagste punt vak %d: %2d  " , i+1,laaggetal);
		laaggetal = 20;
		}
		
		 
		input.close();
		
	}


}


