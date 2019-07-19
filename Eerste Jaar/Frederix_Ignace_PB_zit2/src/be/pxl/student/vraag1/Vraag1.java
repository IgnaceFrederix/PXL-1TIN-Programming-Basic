package be.pxl.student.vraag1;

import java.util.Scanner;

public class Vraag1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] woord = new String [5];
		int tellerwoord =0;
		int isNietE = 1;
		
		System.out.println("Wat is de stam van het werkwoord? geef eind in om te stoppen.");
		System.out.print("Stam: " );
		woord[tellerwoord] = input.nextLine();
		while(!(woord[tellerwoord].equals("eind")) && tellerwoord <4 ){
			
			
			tellerwoord++;
			System.out.print("Stam: " );
			woord[tellerwoord] = input.nextLine();
		}
		System.out.printf("%-10s | %-10s | %-10s  | %-10s\n","Werkwoord", "TT", "VT", "VVT");
		for(int i =0; i< woord.length;i++){
			
				
			
			StringBuilder werkwoord = new StringBuilder();
			StringBuilder TT = new StringBuilder();
			StringBuilder VT = new StringBuilder();
			StringBuilder VVT = new StringBuilder();
			
			//werkwoord if
			if(woord[i].charAt(woord[i].length()-1)=='e'){
				werkwoord = werkwoord.append(woord[i]+"n");
			}else{
				werkwoord = werkwoord.append(woord[i]+"en");
			}
			//TT if
			if(woord[i].charAt(woord[i].length()-1)=='t'){
				TT = TT.append(woord[i]);
			}else{
				TT = TT.append(woord[i]+"t");
			}
			if(woord[i].charAt(woord[i].length()- isNietE)=='e'){
				isNietE =2;
			}
			//VT if
			if(woord[i].charAt(woord[i].length()- isNietE)=='t' ||
			   woord[i].charAt(woord[i].length()- isNietE)=='k' ||
			   woord[i].charAt(woord[i].length()- isNietE)=='f' ||
			   woord[i].charAt(woord[i].length()- isNietE)=='s' ||
			   woord[i].charAt(woord[i].length()- isNietE)=='c' ||
			   woord[i].charAt(woord[i].length()-isNietE)=='h' ||
			   woord[i].charAt(woord[i].length()-isNietE)=='p'){
				VT = VT.append(woord[i]+"te");
			}else{
				VT = VT.append(woord[i]+"de");
			}
			
			//VVT if
			if(woord[i].charAt(woord[i].length()-1)=='t' ||
					 woord[i].charAt(woord[i].length()-1)=='d'){
				
					 VVT = VVT.append("ge"+woord[i]);
			}else if(	   woord[i].charAt(woord[i].length()- isNietE)=='t' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='k' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='f' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='s' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='c' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='h' ||
						   woord[i].charAt(woord[i].length()-isNietE)=='p'
						   
						   ){
					VVT = VVT.append("ge"+ woord[i]+"t");
			}else{
				VVT = VVT.append("ge"+ woord[i]+"d");
			}
			
			
			if(woord[i].equals("eind")){
				break;
			}else{
				System.out.printf("%-10s | %-10s | %-10s  | %-10s \n",werkwoord, TT, VT, VVT);
			}
			
			isNietE = 1;
			
			
		}
			
		
		input.close();

	}

}
