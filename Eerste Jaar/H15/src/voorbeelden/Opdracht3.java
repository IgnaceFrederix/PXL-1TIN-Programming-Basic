package voorbeelden;

import java.util.*;

public class Opdracht3 {
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
		catch (NumberFormatException  ex){
			System.out.println("er is een fout ");
		}
		finally{
			System.out.println("het einde van het programmma test1");
		}
		System.out.println("het einde van het programma test2");
	
	}
}
