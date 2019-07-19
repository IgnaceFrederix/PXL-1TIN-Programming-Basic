package be.pxl.h7.exeoef2;

import java.util.Scanner;

public class Exeoef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int studentnummer;
		System.out.println("geef een studentennummer in");
		studentnummer = input.nextInt();
		input.nextLine();
		int aantalll[] = new int[] {5,15,15};
		String [] klassen ={"4BIA", "5AVC","TESTKLAS"};
		int voorschot[] = new int[] {50,70,100};
		int onkost[] = new int[voorschot.length] ;
		int teller =0;
		int onkost2;
		while(studentnummer != 0)
		{
			teller++;
			System.out.println("geef je onkost voor student "+studentnummer);
			onkost2=input.nextInt();
			System.out.println("geef een studentennummer in");
			studentnummer = input.nextInt();
			onkost[teller-1]=onkost2;
				
		}
		for(int i =0; i< klassen.length;i++)
		{
			System.out.println(klassen[i]+"heeft "+ aantalll[i]+" leerlingen "+" met een voorschot van "+ voorschot[i]);
			for(int j=0; j <aantalll[i]; j++)
			{
				if(onkost[i]> voorschot[i])
				{
				System.out.println("Studnetnummer "+(j+1) + " heeft " + onkost[j]+ " euro onkosten en moet dus nog "+ (onkost[j]-voorschot[j])+"euro betalen");
				}else{
					System.out.println("Studnetnummer "+(j+1) + " heeft " + onkost[j]+ " euro onkosten en krijgt dus "+ (voorschot[j]-onkost[j])+"euro terug");
				}
			}
		}
		input.close();
	}

}
