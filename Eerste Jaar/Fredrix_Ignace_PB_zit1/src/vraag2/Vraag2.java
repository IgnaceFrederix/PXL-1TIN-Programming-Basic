package vraag2;

import java.math.BigInteger;

public class Vraag2 {

	public static void main(String[] args) {
	//	long  getal;
		
		BigInteger getal = BigInteger.valueOf(1);
		
		byte [] getallen = new byte [1];
		BigInteger big = new BigInteger(getallen);
		for(byte i = 1; i < 101; i++)
		{
			getal = getal.multiply(BigInteger.valueOf(i));
			System.out.println(getal + "eerste getal tweede i "+ i);
			//System.out.println(i);
		///	sum = sum.add(BigInteger.valueOf(i));
			
		}
		//getallen[0]= (byte)getal;
		System.out.println(big);
		System.out.println(getal);
	}

}
