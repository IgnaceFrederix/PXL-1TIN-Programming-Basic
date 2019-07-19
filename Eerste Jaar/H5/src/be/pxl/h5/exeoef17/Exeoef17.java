package be.pxl.h5.exeoef17;

import java.util.Scanner;

public class Exeoef17 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double percentage;
		 double perc;
		 double begin;
		 double eind;
		 int jaren;
		 double dubbel;
		 System.out.println("geef een beginbedragin");
		 begin = input.nextDouble();
		 System.out.println("geef een percentage in");
		 percentage = input.nextDouble();
		 perc = percentage;
		 jaren =0;
		 dubbel = (2*begin);
		 while(begin < dubbel)
		 {
			 
			 eind = begin*(1+(perc)/100.0);
			 System.out.println( "dit jaar is uw" + begin+" euro" + eind +"waard");
			
			begin = eind;
			
			jaren++;
		 }
		 System.out.println("het kost " + jaren+" jaren voor uwe begin bedrag verdubbelt is");
		 input.close();

	}

}
