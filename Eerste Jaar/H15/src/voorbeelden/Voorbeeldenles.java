package voorbeelden;

import java.util.*;

public class Voorbeeldenles {
	public static void main(String args[]) {
		try{
	    Scanner keyboard = new Scanner(System.in);	   
		int numerator = Integer.parseInt(keyboard.next());
		int denominator = Integer.parseInt(keyboard.next());
		int division = numerator / denominator;

		System.out.println(numerator + "/" + denominator + "="
				+ division);
		keyboard.close();
		}
		catch (NumberFormatException ex){
			System.out.println("Je hebt geen geheel getal ingelzen");
		}
		catch (ArithmeticException ex){
			System.out.println("Delen door 0 kan niet");
		}
		catch (RuntimeException ex){
			System.out.println("foute invoer if delen door 0");
		}
		
		System.out.println("het einde van het programma");
	}
}