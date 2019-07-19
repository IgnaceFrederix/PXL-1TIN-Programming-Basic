package voorbeeldenWrapperklasse;

import java.math.BigInteger;
import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int get = input.nextInt();
		int fac = 1;
		for(int i =2; i <= get; i++){
			fac = fac*i;
		}
		System.out.println(fac);
		
		
		
		
		BigInteger facBig = new BigInteger("1");
	//alternatief	BigInteger facBig = BigInteger.ONE;
		for(int i =2; i <= get; i++){
			facBig = facBig.multiply(new BigInteger(""+i));
			
		}
		System.out.println(facBig);
		
		
		input.close();

	}

}
