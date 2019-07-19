package be.pxl.h5.exeoef10;

import java.util.Scanner;

public class Exeoef10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jaar;
		double rest4;
		int rest400;
		int rest100;
		System.out.println("geef een jaar is");
		jaar = input.nextInt();
		rest4 = jaar%4;
		rest100 = jaar%100;
		rest400 = jaar%400;
		if(rest400 ==0){
			System.out.println("het is een schrikkeljaar");
			
		}else{
			if(rest100 == 0)
			{
				System.out.println("het is geen schrikkeljaar");
			}else{
				if(rest4 ==0)
				{
					System.out.println("het is een schrikkeljaar");
				}else{
					System.out.println("het is geen schrikkeljaar");
				}
				
			}
		}
		input.close();

	}

}
