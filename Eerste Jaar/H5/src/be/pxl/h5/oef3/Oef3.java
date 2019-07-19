package be.pxl.h5.oef3;
import java.util.Scanner;

public class Oef3 {
	  public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);  
		  double verbruikskost;
		  double kostpl;
		  double prijs;
		  double verbruik;
		 int km;
			System.out.println("geef de gereden kilometer in");
			km = input.nextInt();
		 
		 System.out.println("geef het verbruik in liter per 100 km in");
		 prijs = input.nextDouble();
		
		 System.out.println("geef de prijs per liter in");
		 verbruik = input.nextDouble();
		 kostpl =(((verbruik/100))*prijs);
		 verbruikskost = kostpl*km;
		 System.out.println("de kost per jaar is " + verbruikskost + " de kost per liter is " + kostpl);
		 input.close();
	 	 
	

}
}

