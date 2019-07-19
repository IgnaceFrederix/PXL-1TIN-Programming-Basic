package opdracht1;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef een getal in");
		String input1 = input.nextLine();
		Integer i = Integer.parseInt(input1);
		
		i+=45;
		System.out.println(i);
		
		System.out.println(i.SIZE);
		
		System.out.println(i.BYTES);
		
		
		
		input.close();
	}

}
