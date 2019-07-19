package be.pxl.h5.exeoef4;

import java.util.Scanner;

public class Exeoef4 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a;
		 int b;
		 int c;
		 int d, e;
		 System.out.println("geef getal a in");
		 a = input.nextInt();
		 System.out.println("geef getal b in");
		 b = input.nextInt();
		 System.out.println("geef getal c in");
		 c = input.nextInt();
		 d = b;
		 b=a;
		 e = c;
		 c = d;
		 
			//a = e; 
		 System.out.println(e);
		 System.out.println(b);
		 System.out.println(c);
		 input.close();
	}

}
