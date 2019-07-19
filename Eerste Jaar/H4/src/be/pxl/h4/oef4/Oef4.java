package be.pxl.h4.oef4;
import java.util.*;

public class Oef4 {

	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int aankoopprijs;
	        int jaar;
	        int rating;
	        System.out.println("geef het jaar van uitgave van de film");
	        jaar = input.nextInt();
	        System.out.println("geef een getal van 0 tot 5 mee voor de rating van de film");
	        rating = input.nextInt();
	        jaar = 2015 - jaar;
	        if (jaar > 2) {
	            aankoopprijs = 5;
	        } else {
	            aankoopprijs = 5 + 1;
	        }
	        if (rating > 3) {
	            aankoopprijs = aankoopprijs + 2;
	        } else {
	            if (rating < 2) {
	            } else {
	                aankoopprijs = aankoopprijs + 1;
	            }
	        }
	        if (aankoopprijs > 7) {
	            aankoopprijs = 7;
	        }
	        System.out.println("De prijs van de film is " + aankoopprijs + " euro");
	    }
	}

	

	


