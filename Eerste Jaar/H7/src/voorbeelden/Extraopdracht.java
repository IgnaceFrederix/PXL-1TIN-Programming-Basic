package voorbeelden;

import java.util.Random;

public class Extraopdracht {

	public static void main(String[] args) {
		// genereer 2489 gehele getallen >= en <=6 / gan na dat elke getal ongeveer even vaak voorkomt druk het procenteel andeel af
	//0=> maandag; 1 => dinsdag;.. de dagen moeten ook worden afgedrukt
		Random rand= new Random();
		int get;
		int[] teller = new int [7];
		String [] dagen ={"ma","di","woe","dond","vrij","za","zon"};
		for(int i = 0; i < 2489; i++)
		{
			get = rand.nextInt(7);
			teller[get] = teller[get]+1;
		}
		double perc;
		int tel = 0;
		for(int i = 0; i< teller.length; i++)
		{
			System.out.printf("%s \t %.2f %% \n",dagen[i],teller[i]/2489.0*100);
		}
		for(int g : teller){
			perc = g/2489.0*100;
			System.out.printf("%s \t %.2f %%\n", dagen [tel++], perc);
		}
	}

}
