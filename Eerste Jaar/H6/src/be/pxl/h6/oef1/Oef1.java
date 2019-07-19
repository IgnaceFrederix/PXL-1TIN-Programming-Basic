package be.pxl.h6.oef1;

import java.util.Random;

public class Oef1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int get = rand.nextInt();
		int get1 = rand.nextInt();
		for(char kar = 'A'; kar <= 'F'; kar++)
		{
			System.out.println("reeks"  +kar);
		
			for(int i = 1; i < 6 ; i++)
			{
					get = rand.nextInt(21);
					get1 = rand.nextInt(get+1);
					System.out.println(i+")"+ get +"-" + get1 + "=");
				
				
			}
		}
		}
}

