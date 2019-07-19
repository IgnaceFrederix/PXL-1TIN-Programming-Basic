package voorbeeldenWrapperklasse;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String getal1 = input.next();
		Integer get1 = Integer.parseInt(getal1);
		get1 = get1 + 69;
		System.out.println(get1);
		System.out.println("het aantal bits voor een Integer " + Integer.SIZE);
		System.out.println("het aantal bytes voor een Integer " + Integer.BYTES);
		
		
		input.close();
		
		

	}

}
