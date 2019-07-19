package be.pxl.h5.exeoef2;
import java.util.Scanner;
public class exeoef2 {

	


		public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);
			double F;
			double C;
			System.out.println("geef de graden feirenheid in");
			 F = input.nextDouble();
			 C =  (F-32)/(9.0/5.0);
			
			 System.out.println("de temeratuur in C is " + C);
			input.close();
		}


}
