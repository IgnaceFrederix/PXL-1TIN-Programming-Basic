package voorbeelden;

import java.util.Random;

public class Voorbeeld1 {

	public static void main(String[] args) {
		Random rand = new Random();
		//genereer een willekeurig geheel getal
		int get = rand.nextInt();
		System.out.println(get);
		for(int i =0; i <= 20; i++)
		{
			get = rand.nextInt(11);
					System.out.println(get);
		}
		for(int i =0; i <= 20; i++)
		{
			get = rand.nextInt(11)+20;
					System.out.println(get);
		}
		

	}

}
