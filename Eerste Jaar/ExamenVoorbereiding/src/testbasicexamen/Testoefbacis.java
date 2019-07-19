package testbasicexamen;

import java.util.Scanner;

public class Testoefbacis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] getal = new int [7];
		int test = 1;
		System.out.println("geef in of je nog wilt verder gaan 1 voor ja 0 voor nee");
		test = input.nextInt();
		while(test !=0){
			
			
					for(int i =0; i< getal.length; i++){
						System.out.println("geef een getal in");
						getal[i] = input.nextInt();
					}
					
					//for(int i =0; i< getal.length; i++){
						//System.out.println(getal[i]);
					//}
					for(int i : getal){
						System.out.println(i);
					}
					System.out.println("geef in of je nog wilt verder gaan 1 voor ja 0 voor nee");
					test = input.nextInt();
				}
		input.close();
		}
		
}
