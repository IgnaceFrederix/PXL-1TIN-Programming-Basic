package be.pxl.h7.exeoef3;

import java.util.Scanner;

public class Exeoef3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder getalbuilder = new StringBuilder();
		int getal;
		System.out.println("geef een getal in");
		getal = input.nextInt();
		char [] cijfer = {'0','1','2','3','4','5','6','7','8','9'};
		String [] naam ={"nul","een","twee","drie","vier","vijf","zes","zeven","acht","negen"};
		int getal3;
		getalbuilder = getalbuilder.append(getal);
		for(int i =0; i< cijfer.length; i++ )
		{
			for(int j =0; j< getalbuilder.length(); j++ )
			{
				getal3 = getalbuilder.charAt(j);
				char test= (char)getal3; 
				if(test == cijfer[i])
				{
					System.out.print(naam[i]+" ");
				}
			}
		}
		input.close();
	}

}
