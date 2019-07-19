package vraag1;

import java.util.Scanner;

public class Vraag1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temp[] = new int [7];
		String [] water = new String [7];
		int laagste;
		laagste =30;
		int totaal;
		totaal=0;
		int teller;
		teller=0;
		int teller2;
		teller2=0;
		
		for(int i = 0; i < 7; i++)
		{
			
				
			
			System.out.println("geef de hoeveelheid regen in dag " +(teller2+1) );
			water[i] = input.nextLine();
			
			System.out.println("geef de temperatuur in dag " +(teller2+1));
			temp[i] = input.nextInt();
			input.nextLine();
			if(temp[i] < laagste )
			{
				laagste = temp[i];
			}
			totaal = totaal+temp[i];
			if(!water[teller2].equals("overvloed")){
			teller2++;
			System.out.println(laagste);
			System.out.println(totaal);
			}else{
				break;
			}
			
			}	
		if(water[teller2].equals("overvloed")){
			System.out.println("we blijven thuis");
		}else{
			
		
		System.out.println("dag \t temperatuur \t neerslag");
		for(int i = 0; i< temp.length; i++)
		{
			System.out.println((i+1)+ "\t"+ temp[i]+"\t"+ water[i]);
		}
		if(laagste <= 15 || laagste/5.0 > totaal/7.0)
		{
			for(int i =0; i < water.length; i++){
				if(water[i].equals("veel"))
				{
					teller++;
				}
			}
			if(teller > 0){
				System.out.println("we gaan op dag uitstap");
			}else{
				System.out.println("we gaan op twee daagse");
			}
		}
		
		}
		System.out.println();
		input.close();
	}
		
	
	
}
