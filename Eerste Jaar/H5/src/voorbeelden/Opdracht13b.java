package voorbeelden;

import java.util.Scanner;

public class Opdracht13b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("geef een getal in >= 0 en <= 10");
			int get = input.nextInt();
			while(get > 10 || get < 0)
			{
				System.out.println("Foutieve ingave het getal moet tussen 0 en 10 zijn");
				get = input.nextInt();
			}
			System.out.println("het getal ligt tussen 0 en 10 het getal is "  + get);
			
			input.close();

	}

}
