package voorbeelden;

import java.util.Scanner;

public class Opdracht11d2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double gew;
		int lengte;
		double bmi;

		System.out.println("geef het gewicht in kg in");
		gew = input.nextDouble();
		System.out.println("geef de lengte in");
		lengte = input.nextInt();
		bmi = gew / (lengte / 100 * lengte / 100.0);
		// bmi = gew / (lengte*lengte)*10000;
		if (bmi < 18) 
			System.out.println("ondergewicht");
		 else 
			if (bmi < 25) 
				System.out.println("ok");
			 else 
				if (bmi < 30) 
					System.out.println("overgewicht");
				 else 
					if (bmi < 40) 
						System.out.println("obesotas");

					 else 
						System.out.println("ziekgelijk overgewicht");
					
				
			
		
		input.close();
	}

}
