package vraag3;

import java.util.Scanner;

public class Vraag3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;
		getal=1;
		String tekst;
		StringBuilder spatie = new StringBuilder();
		int pos;
		int teller;
		teller =1;
		String tekst2;
		while(getal > 0)
		{
			System.out.println("geef een tekst in");
			tekst = input.nextLine();
			System.out.println("geef een lengte in");
			getal = input.nextInt();
			input.nextLine();
			tekst = tekst.trim();
			String tekst3;
			int getal2 =0;
			for(int i = 0; i < getal; i++)
			{
				System.out.print("-");
			}
			System.out.println();
			int pos2 = 0;
			int tellerwhile = 1;
			if(tekst.length() > getal)
			{
				tekst3 = tekst;
				while(pos2+getal <= tekst.length())
				{
				tekst3 = tekst.substring(pos2,tekst.length()-pos2);
				System.out.println("tekst3 is nu: bij" + tellerwhile +" is nu: "+tekst3+"\n");
				tekst3 = tekst3.substring(getal2,getal);
				if(tekst3.substring(getal).equals(" ")){
					System.out.println(tekst3);
					
				}else{
					pos2 = tekst3.lastIndexOf(" ");
					tekst3 = tekst.substring(getal2,pos2);
					if(tekst3.length()!=getal){
						for(int i =0; i< getal-tekst3.length(); i++){
							spatie.append(" ");
						}
					}
					System.out.println(spatie+tekst3+"\n");
					System.out.println(getal2 + " "+ tekst3+" "+ pos2);
					getal2 = getal2+ pos2;
					spatie=spatie.delete(0, spatie.length());
				}
				tellerwhile= tellerwhile+1;
				//tekst = tekst.replace(" ", "\n");
				}
				//System.out.println(spatie);
				/*while(pos != -1)
				{
				
				for(int i = tekst.indexOf("\n") ; i < getal; i++)
				{
					spatie = spatie.append(" ");
					teller++;
					pos = spatie.indexOf(" \n",pos+1);
				}
				pos = tekst.indexOf("\n"+1);
				//pos = tekst.indexOf("\n",pos+1);				
				}
				spatie.append(tekst);
				System.out.println(spatie);
				System.out.println(tekst.indexOf("\n"));
				*/
			}else{
				
				for(int i = tekst.length(); i < getal; i++){
					spatie = spatie.append(" ");
				}
				spatie.append(tekst);
				System.out.println(spatie);
			}
			
		}
		
		
		
input.close();
	}
	

}
