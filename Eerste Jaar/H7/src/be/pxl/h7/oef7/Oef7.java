package be.pxl.h7.oef7;

public class Oef7 {

	public static void main(String[] args) {
		int stuks [][] = new int [][]{{45,102,19,55,0},{79,47,58,22,46},{109,33,112,0,0}};
		int totaal [] = new int[3];
		int totaal2=0;
		String [] kleur ={"rood","wit","blauw","oranje","zwart"};
		String [] maat = {"small","medium","large"};
	for(int i = 0; i < stuks.length; i++){
			
			for(int j = 0; j < stuks[0].length; j++){
				totaal2 =  totaal2 + stuks[i][j];
	}
			totaal[i]=totaal2;
			totaal2 = 0;
	}
	for(int i = 0; i < stuks.length; i++){
		
		for(int j = 0; j < stuks[0].length; j++){
			if(totaal[i]/3 > stuks[i][j] )
			{
				System.out.print(maat[i]);
				System.out.print(" " + kleur[j]);
				System.out.println();
			}
		}
}
}
}

