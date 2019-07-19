package be.pxl.h7.oef2;
import java.util.Random;
public class Oef2 {

	public static void main(String[] args) {
		int getal;
		getal = 0;
		
		long test;
		test = 0;
		Random random = new Random();
		int [] nummer = new int [500];
		for (int i = 0; i < nummer.length;i++){
			nummer [i] = random.nextInt();
		}
		for(int get : nummer){
			if(get > 100)
			{
				test = getal+get;
			}
		}
		System.out.println(test);
		

	}

}
