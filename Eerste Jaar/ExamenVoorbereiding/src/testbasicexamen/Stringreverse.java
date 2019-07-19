package testbasicexamen;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String testre;
		StringBuilder spatie = new StringBuilder();
		System.out.println("geef een lijn in");
		
		testre = input.nextLine();
		testre.trim();
		spatie = spatie.append(testre);
		//spatie.reverse();
		testre = spatie.toString();
		testre.trim();
		
		System.out.println(testre);
		input.close();
	}

}
