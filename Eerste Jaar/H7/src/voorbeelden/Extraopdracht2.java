package voorbeelden;

import java.util.Random;

public class Extraopdracht2 {

	public static void main(String[] args) {
		Random rand= new Random();
		int get;
		int[] teller = new int [8];
		String [] dagen ={"","ma","di","woe","dond","vrij","za","zon"};
		for(int i = 0; i < 2489; i++)
		{
			get = rand.nextInt(7)+1;
			teller[get] = teller[get]+1;
		}
		double perc;
		for(int i = 1; i < teller.length; i++)
		{
			perc = teller[i] /2489.0*100;
		//versie1	System.out.printf("%d %.2f %% \n",tel++, perc);
			System.out.printf("%S \t %.2f %%\n", dagen [i], perc);
		}
	}

}
