package be.pxl.h12.oef1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Oef1 {

	public static void main(String[] args) {
		char c = '5';
		Character c1 = 'A';
		
		int i = 10;
		Integer i1 = i;
		
		long l = 10;
		Long l1 = l;
		
		
		float f = 100.500F;
		Float f1 = f;
		
		double d = 500.500;
		Double d1 = d;

		Object test[] = new Object[5];
		test[0] = c1;
		test[1] = i1;
		test[2] = l1;
		test[3] = d1;
		test[4] = f1;

		for (int j = 0; j < test.length; j++) {
			System.out.println(test[j]);
		}

		//Collections.shuffle(Arrays.asList(test));
		System.out.println("--------------------------");

		for(Object o : test){
			
			if(o instanceof Character){
				if(Character.isLetter((char) o)){
					if(Character.isUpperCase((char) o)){
						System.out.println("het is een grote letter");
					}else if (Character.isLowerCase((char) o)){
						System.out.println("het is een kleine letter");
					}
				}else if (Character.isDigit((char) o)){
					System.out.println("het is een cijfer");
				}
			}
				//bovenstaand werkt
				
					
					if (o instanceof Long){
						if((Long) o <0){
							Long afstand = Long.MIN_VALUE -(Long) o;
							System.out.println(afstand);
						}else{
							Long afstand = Long.MAX_VALUE -(Long) o;
							System.out.println(afstand);
						}
						
					}else if(o instanceof Integer){
						if((Integer) o <0){
							Integer afstand = Integer.MIN_VALUE -(Integer) o;
							System.out.println(afstand);
						}else{
							Integer afstand = Integer.MAX_VALUE -(Integer) o;
							System.out.println(afstand);
						}
					}else if (o instanceof Double){
						String cijfer = o.toString();
						int komma = cijfer.indexOf(".");
						String voorKomma = cijfer.substring(0,komma-1);
						int lengtevoorKomma =voorKomma.length();
						String naKomma = cijfer.substring(komma+1);
						int lengtenaKomma =naKomma.length();
						System.out.println("voor de komma : " + lengtevoorKomma);
						System.out.println("na de komma : " + lengtenaKomma);
						
					}else if(o instanceof Float){
						String cijfer = o.toString();
						int komma = cijfer.indexOf(".");
						String voorKomma = cijfer.substring(0,komma-1);
						int lengtevoorKomma =voorKomma.length();
						String naKomma = cijfer.substring(komma+1);
						int lengtenaKomma =naKomma.length();
						System.out.println("voor de komma : " + lengtevoorKomma);
						System.out.println("na de komma : " + lengtenaKomma);
					}
				
			
			
		}

	}
}
