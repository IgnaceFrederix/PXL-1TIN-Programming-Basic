package be.pxl.h4.oef1;
import java.util.*;

public class Oef1 {
	

	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int volwassen;
	        int kind;
	        int aantalvolw;
	        int aantalkind;
	        int sum;
	        
	        volwassen = 28;
	        kind = 15;
	        System.out.println("geef het aantal volwassen in ");
	        aantalvolw = input.nextInt();
	        System.out.println("geef het aantal kinderen in");
	        aantalkind = input.nextInt();
	    
	        sum = volwassen * aantalvolw + kind * aantalkind;
	        System.out.println("het te betalen bedrag is" +" " + sum);
	        
	    }
	}


