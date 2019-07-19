package be.pxl.h7.exeoef7;

import java.util.Scanner;

public class Exeoef7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] juist = new String [5];
		int code;
		code =1;
		int teller;
		teller =1;
		int teller2 =0;
		int tijd;
		String [] ingegeven = new String [5];
		int score = 10;
		int scoreteller[] = new int [10];
		int code2 [] = new int [10];
		int tijd2 [] = new int [10];
		float gemiddelde=0;
		float gemiddelde2 [] = new float [10];
	
		for(int i=0; i <juist.length; i++)
		{
			System.out.println("geef het juiste antwoord in");
			juist[i] = input.nextLine();
		}
		System.out.println("geef de tijd die je nodig had in seconde");
		tijd = input.nextInt();
		System.out.println("geef je deelnemersnummer in");
		code = input.nextInt();
		
		input.nextLine();
		while(code !=0)
		{
		for(int j=0; j <ingegeven.length; j++)
		{
			System.out.println("geef je antwoord in");
			ingegeven[j] = input.nextLine();
			if(juist[j].equals(ingegeven[j]))
			{
				gemiddelde=gemiddelde2[j]+1;
				gemiddelde2[j]=gemiddelde;
				System.out.println(gemiddelde2[j]);
				gemiddelde=gemiddelde2[j];
				for(int i=0; i <ingegeven.length; i++)
				{
					//score=score;
				}
				score=score+3;
			}else{
				score=score-1;
			}
			if(ingegeven[j].equals("e"))
			{
				score = score+1;
			}
			
		}
	
		for(int i =0;i< teller; i++)
		{
			if(tijd <100)
			{
				score = score+5;
			}else{
				if(tijd<200)
				{
					score = score+2;
				}else{
					if(tijd<300)
					{
						//score=score;
					}else{
						score= score-5;
					}
				}
			}
		scoreteller[teller2]= score;
		code2[teller2]=code;
		tijd2[teller2]=tijd;
		teller2++;
		}
		System.out.println("geef de tijd die je nodig had in seconde");
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
			System.out.println(i+1+". \t" +code2[i]+"\t"+(tijd2[i]%3600)/60+" m "+ tijd2[i]%60+" s \t" +scoreteller[i]+" ptn");
			
		}
		for(int i=0;i < juist.length; i++)
		{
			System.out.println("het algemene percentage van juist geantowoorde vrage voor vraag "+ i+1);
			System.out.printf("%.2f",(gemiddelde2[i]/teller)*100+" %");
			System.out.println();
		}
	
		input.close();
	}

}
