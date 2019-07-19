package voorbeelden;
import java.util.*;

public class Voorbeeld2 {



	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int age;
	        System.out.println("geeft de leeftijd in");
	        age = input.nextInt();
	        if (age >= 18) {
	            System.out.println("de persoon is een volwassenen");
	        } else {
	            if (age >= 10) {
	                System.out.println("de persoon is een tiener");
	            } else {
	                if (age >= 2) {
	                    System.out.println("de persoon is een kind");
	                } else {
	                    System.out.println("de persoon is een baby");
	                }
	            }
	        }
	    }
	}


