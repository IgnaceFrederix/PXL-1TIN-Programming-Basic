package be.pxl.h7.oef6;

import java.util.Scanner;

public class Oef6 {

	public static void main(String[] args) {
		int points [][] = new int[5][4];
	int  leerling[] = new int[5];
	int gemiddelde [] = new int[5];
	int laagste[] = new int[]{20,20,20,20,20};
		int gem = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < points.length; i++) {
			System.out.printf("Geef de punten van student %d", (i+1));
			System.out.println();
			for (int j = 0; j < points[i].length; j++) {
				System.out.printf("Geef de punten voor vak %d", (j+1));
				points[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i < points.length; i++){
			
			for(int j = 0; j < points[0].length; j++){
				System.out.printf("%2d  " , points[i][j]);
				
				if(laagste[j] > points[i][j])
				{
					laagste[j] = points[i][j];
					leerling[j]= i;
				}
			}
			System.out.println();
		}
		for(int j = 0; j < points[0].length; j++){
			for(int i = 0; i < points.length; i++){
				gem = gem+points[i][j];
			}
			gemiddelde[j] = gem;
			gem = 0;
			}
		for(int i = 0; i < points[0].length; i++){
			System.out.println("leerling slechts voor vak " + (i +1)+ "is"+(leerling[i]+1));
			System.out.println("laagtste cijfer voor vak"+ (i +1)+"is" +laagste[i]);
			System.out.println("voor vak" + (i +1) +"is het gemiddelde"+  gemiddelde[i]/5.0);
			System.out.println();
		}
		
		input.close();

}
}