package voorbeelden;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef het maandnr in");
		int maandnr = input.nextInt();
		int[] dagen = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("het aantal dagen is"+ dagen[maandnr-1]);
		
		
		
		input.close();
	}

}
