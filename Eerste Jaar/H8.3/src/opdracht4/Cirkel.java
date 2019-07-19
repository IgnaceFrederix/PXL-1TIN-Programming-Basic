package opdracht4;

import java.util.Scanner;

public class Cirkel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner invoer = new Scanner(System.in); 
			System.out.println("geef de oppervalte in");
			double opp = invoer.nextDouble();
			double diameter = 2*Math.sqrt(opp/Math.PI);
			System.out.println(diameter);
			System.out.printf("%.2f%", diameter);
			
	}

}
