package be.pxl.h4.oef6;
import java.util.*;

public class Oef6bis {


	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	    	System.out.println("geef een getal in");
	        int invoergetal;
	        int getal;
	        
	        invoergetal = input.nextInt();
	        for (getal = 1 ; getal <= 20 ; getal += 1) {
	            System.out.println(getal + "x" + invoergetal + "=" + getal * invoergetal);
	        }
	    }
	

}
