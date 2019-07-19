package voorbeelden;

import java.util.Scanner;

public class Voorbeeld3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String tekst;
		tekst = keyboard.next();
		System.out.println(tekst);
		tekst = keyboard.nextLine();
		System.out.println(tekst);
		keyboard.close();
	}

}
