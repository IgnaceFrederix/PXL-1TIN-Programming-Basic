package be.pxl.h4.extraoef1;
import java.util.*;

public class Extraoef1 {

	

	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int kwadraat;
	        System.out.println("geef een eerste getal in");
	        a = input.nextInt();
	        System.out.println("geef een tweede getal in");
	        b = input.nextInt();
	        if (a > b) {
	            kwadraat = b * b;
	            System.out.println("Het kleinste getal is " + b);
	            System.out.println("Het kwadraat van het kleinste getal is" + kwadraat);
	        } else {
	            kwadraat = a * a;
	            System.out.println("Het kleinste getal is" + a);
	            System.out.println("Het kwadraat van het kleinste getal is " + kwadraat);
	        }
	    }
	}


