package be.pxl.h4.oef3;
import java.util.*;

public class Oef3 {
	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int prijsps;
	        int aantals;
	        int totaalprijs;
	        int eindprijs;
	        System.out.println("geef het aantal stuks in");
	        prijsps = input.nextInt();
	        System.out.println("geef de prijs per stuk in ");
	        aantals = input.nextInt();
	        totaalprijs = prijsps * aantals;
	        if (totaalprijs > 500) {
	            eindprijs = totaalprijs - 10;
	            if (eindprijs > 1000) {
	                eindprijs = eindprijs - 22;
	            } 
	        } else {
	            eindprijs = totaalprijs;
	        }
	        System.out.println("de totaal prijs van al uw producten is " + eindprijs +" euro");
	    }
	

}
