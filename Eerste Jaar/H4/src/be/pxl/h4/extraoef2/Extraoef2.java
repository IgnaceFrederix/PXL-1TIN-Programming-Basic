package be.pxl.h4.extraoef2;
import java.util.*;
public class Extraoef2 {


	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int c;
	        int uitkomst;
	        System.out.println("geef een eerste getal in");
	        a = input.nextInt();
	        System.out.println("geef een tweede getal in");
	        b = input.nextInt();
	        System.out.println("geef een derde getal in");
	        c = input.nextInt();
	        if (a + b < 20) {
	            uitkomst = a + b + c;
	            System.out.println("De som is " + uitkomst);
	        } else {
	            System.out.println("te groot");
	        }
	    }
	}


