package be.pxl.h5.exeoef12;

import java.util.Scanner;

public class Exeoef12 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int nummer;
		 double uurloon;
		 int uren;
		 int max;
		 max = 0;
		 double urenboven;
		 System.out.println("geef een nummer in");
		 nummer = input.nextInt();
		 while (nummer != 0)
		 {
			 System.out.println("geef een uurloon in");
			 uurloon = input.nextDouble();
			 System.out.println("geef het aantal uren in");
			 uren = input.nextInt();
			 if(uren > 38)
			 {
				 urenboven = uren-38;
				 urenboven = ((urenboven*uurloon)*1.5);
				urenboven = ((urenboven+(uren*uurloon)));
			 }
			 else{
				 urenboven = (uren*uurloon);
			 }
			 if(uren > max)
			 {
				 max = nummer;
			 }
			 System.out.println(nummer);
			
			 System.out.println(urenboven);
			 System.out.println("geef een nummer in");
			 nummer = input.nextInt();
			 
		 }
		 System.out.println("de persoon met de meest gebruikte uren" +max);
		 
		 input.close();

	}

}
