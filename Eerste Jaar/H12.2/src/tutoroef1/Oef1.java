package tutoroef1;

import java.util.Scanner;

public class Oef1 {

	public static void main(String[] args) {
		System.out.println("geef een int , een karakter, en een float in  ");
		char a = args[0].charAt(0);
		int i = Integer.parseInt(args[1]);
		
		System.out.println(a);
		System.out.println(i);
		Object o1 = args[0].charAt(0);
		//als je een parameter wilt toevoegen kan je dit doen door run => run configurations en daar dan je parameters toevoegen
		if(o1 instanceof Integer ){
			System.out.println("het is een integer");
		}else{
			System.out.println("het is een karakter");
		}
		
		
		

	}

}
