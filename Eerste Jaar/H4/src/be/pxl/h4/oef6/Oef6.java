package be.pxl.h4.oef6;
import java.util.*;

public class Oef6 {
	

	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int getal;
	        int count;
	        
	        count = 1;
	        System.out.println("geef een getal voor tot maal 20");
	        getal = input.nextInt();
	        while (count < 21) {
	            System.out.println(count + " x " + getal + "=" + count * getal);
	            count = count + 1;
	        }
	    }
	}



