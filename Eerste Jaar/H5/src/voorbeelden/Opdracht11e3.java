package voorbeelden;

import java.util.Scanner;

public class Opdracht11e3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bs, lft, lidg;
		System.out.println("ingave van burgelijke staat 1 = ongehuwd 2 = gehuwd 3 = weduwe(naar)");
		bs = input.nextInt();
		System.out.println("ingave leeftijd");
		lft = input.nextInt();
		if(lft < 30 || bs == 1){
			lidg = 25;
		}else{
			lidg = 15;
		}
		
		
		System.out.println("het te betalen lidgeld is" + lidg);

		input.close();
	}

}
