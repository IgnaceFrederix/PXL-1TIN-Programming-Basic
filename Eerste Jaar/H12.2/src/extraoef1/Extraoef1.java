package extraoef1;

import java.util.Random;
import java.util.Scanner;


public class Extraoef1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int teller=0;
		String []lijst = new String[20];
		int teller2 =0;
		int []getallen = new int[100];
		String []lijst2 = new String[100];
		
		String lijn ="";
		while(!lijn.equals("stop")){
			System.out.println("geef een lijn in met getallen splits ze met één spatie ");
			lijn = input.nextLine();
			lijst[teller] = lijn;
			teller++;
		
			while(lijn.indexOf('a') !=-1){
				lijst2[teller] = lijn.trim(" ");
			}
			
			
		}
		for(int i=0; i<teller; i++){
		
		if(lijst[teller2].length()%2==0){
			System.out.println();
		}
				System.out.println(lijst[teller2]);
				teller2++;
				
			}
		
			Random r = new Random();
			 int getal = r.nextInt(5)+5;
			System.out.println(getal);
		
			input.close();
	}

}
