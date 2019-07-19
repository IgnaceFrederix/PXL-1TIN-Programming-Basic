package voorbeelden;

import java.util.Scanner;

public class Opdracht3f {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef een woord in");
		String txt= input.next();
		int len = txt.length();
		String deel1, deel2, deel3;
		int m = len/2;
		if(len%2 ==0)
		{
			deel1 = txt.substring(0,m-1);
			
			deel2 = txt.substring(m-1,m+1);
			deel3 = txt.substring(m+1);
		}else{
			deel1 = txt.substring(0,m);
			deel2 = txt.substring(m,len +1);
			deel3 = txt.substring(m +1);
		}
		deel2 = deel2.toUpperCase();
		String nieuw = deel1 +deel2+ deel3;
		System.out.println(nieuw);
		
		input.close();

	}

}
