package be.pxl.h5.exeoef15;

import java.util.Scanner;

public class Exeoef15 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int getal1;
		 int getal2;
		 System.out.println("geef de waarde van het vermenigsvuldigetal in");
		 getal1 = input.nextInt();
		 System.out.println("geef de vermeingvuldiger in");
		 getal2 = input.nextInt();
		
		 for(int i =1; i < 5 ; i++)
		 {
			 System.out.println("oefening " + i);
			 for(int j =0; j <= getal1; j++ )
			 { 
				 System.out.println(j +"x" + getal2 + "=");
			 }
			 System.out.println("geef de waarde van het vermenigsvuldigetal in");
			 getal1 = input.nextInt();
			 System.out.println("geef de vermeingvuldiger in");
			 getal2 = input.nextInt();
		 }
		 
		 
		 input.close();

	}

}
