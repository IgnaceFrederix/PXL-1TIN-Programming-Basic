package opdracht3;

import java.util.Scanner;

public class DerdeMacht {

	public static void main(String[] args) {
		int x,res;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		res = (int)Math.pow(x, 3);
		System.out.println(res);
		
		
		input.close();
	}
	

}
