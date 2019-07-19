package be.pxl.h7.exeoef7;

import java.util.Scanner;

public class Exeoef7verbeterd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] juist = new String [5];
		int [] tel= new int[5];
		int code;
		code =1;
		int teller;
		teller =1;
		int teller2 =0;
		int tijd;
		String  ingegeven;
		int score = 10;
		float gemiddelde=0;
		for(int i=0; i <juist.length; i++)
		{
			System.out.println("geef het juiste antwoord in");
			juist[i] = input.nextLine();
		}
		System.out.println("geef je deelnemersnummer in");
		code = input.nextInt();
		
		input.nextLine();
		while(code !=0)
		{
			score =10;
		for(int j=0; j <juist.length; j++)
		{
			System.out.println("geef je antwoord in");
			ingegeven = input.nextLine();
			if(juist[j].equals(ingegeven))
			{	
				score=score+3;
			}else{
				if((ingegeven.equals("E")))	
				score=score-1;
			}
		}
		System.out.println("geef de tijd die je nodig had in seconde");
		tijd = input.nextInt();
	if(tijd >= 300){
		score = score -5;
		tel[3]++;
	}else{
		if(tijd < 100)
		{
			score = score+5;
		}else{
			if(tijd < 200){
				score = score+2;
			}
			tel[tijd/100]++;
		}
		}
		
		tijd = input.nextInt();
		System.out.println("geef je deelnemrsnummer in");	
		code = input.nextInt();
		
		input.nextLine();
		teller++;
		score=10;
		}
		for(int i =0; i < teller-1; i++)
		{
			teller2 =0;
			teller2++;
		//	System.out.println(i+1+". \t" +code2[i]+"\t"+(tijd2[i]%3600)/60+" m "+ tijd2[i]%60+" s \t" +scoreteller[i]+" ptn");
			
		}
		for(int i=0;i < juist.length; i++)
		{
			System.out.println("het algemene percentage van juist geantowoorde vrage voor vraag "+ i+1);
			//System.out.printf("%.2f",(gemiddelde2[i]/teller)*100+" %");
			System.out.println();
		}
	
		input.close();
	}

}
