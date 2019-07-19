package opdracht4;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			System.out.println("geef de oppervlakte in ");	
			double opp = input.nextDouble();
			double dim = 2*Math.sqrt(opp/Math.PI);
			dim = Math.round(dim*100)/100.0;
			System.out.println("diameter"+dim);
				
				
		input.close();		
	}

}
