package voorbeelden;

import java.util.Scanner;

public class Opdracht12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("geef een getal in");
		x = input.nextInt();
		switch(x){
		case 1: System.out.println("het getal is 1 "); break;
		case 2: 
		case 3 : System.out.println("het getal is 2 of 3");break;
		default : System.out.println("het getal is niet 1 2 of 3");
		}
		
		
		
		input.close();

	}

}
