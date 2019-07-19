package voorbeelden;

import java.util.Scanner;

public class Opdracht3d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String txt = input.nextLine();
		
		System.out.println(txt);
		txt = txt.replace('a', 'o');
		System.out.println(txt);
		int tel = 0;
		int len = txt.length();
		for (int i=0; i < len ; i++)
		{
			if(txt.charAt(i)=='e')
			tel++;
		}
		System.out.println(tel);
		String tekst1 = input.nextLine();
		String tekst2 = input.nextLine();
		System.out.println(tekst1.equals(tekst2));
		
		
		if(tekst1.compareTo(tekst2) < 0)
		{
			System.out.println(tekst1 +"komt voor het alfabet" + tekst2 );
		}else{
			System.out.println(tekst2 +"komt voor het alfabet" + tekst1 );
		}
		String txt3 = "           bijna test. tijd om weer te studeren       ";
		txt3.trim();
		System.out.println(txt3);
		input.close();

	}

}
