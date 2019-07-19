package be.pxl.h4.oef2;
import java.util.*;

public class Oef2 {

	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int afgetrokkengetal;
	        int einduitkomst;
	        System.out.println("geef a een waarde");
	        a = input.nextInt();
	        System.out.println("geef b een waarde");
	        b = input.nextInt();
	        if (a > b) {
	            afgetrokkengetal = a - b;
	        } else {
	            afgetrokkengetal = b - a;
	        }
	        einduitkomst = afgetrokkengetal * 5;
	        if (a > b) {
	        System.out.println(a + "-" + b +"=" + afgetrokkengetal);
	        System.out.println( afgetrokkengetal +"*5 = " + einduitkomst);
	        }
	        else
	        {
	        	 System.out.println(b + "-" + a +"=" + afgetrokkengetal);
	 	        System.out.println( afgetrokkengetal +"*5 = " + einduitkomst);
	        }
	        }
	    }
	



