package be.pxl.h4.extraextraoef2;
import java.util.*;
public class Oef2 {
	

	
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int c;
	       
	        System.out.println("geef een eerste punt in");
	        a = input.nextInt();
	        System.out.println("geef een tweede punt in");
	        b = input.nextInt();
	        System.out.println("geef een derde punt in");
	        c = input.nextInt();
	        
	        if (a > 0) {
	            if (b > 0) {
	                if (c > 0) {
	                    System.out.println("de formule heeft geen 0 punten");
	                } else {
	                    System.out.println("de formule heeft één 0 punt");
	                }
	            } else {
	                if (c > 0) {
	                    System.out.println("de formule heeft 1 0 punt punten");
	                } else {
	                    System.out.println("de formule heeft 2 0 punt");
	                }
	            }
	        } else {
	            if (b > 0) {
	                if (c > 0) {
	                    System.out.println("de formule heeft 1 0 punten");
	                } else {
	                    System.out.println("de formule heeft 2 0 punt");
	                }
	            } else {
	                if (c > 0) {
	                    System.out.println("de formule heeft 2 0 punt punten");
	                } else {
	                    System.out.println("de formule heeft 3 0 punt");
	                }
	            }
	        }
	    }
	}

