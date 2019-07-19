package p15;

import p13.Numberduo;

public class BothApp {

	public static void main(String[] args) {
		Both<Integer> nd1 = new Both<>(3,5);
		Both<Double> nd2 = new Both<>(3.2,5.8);
	//Numer gaat niet omdat die niet Comparable gebruikt
		
		System.out.println(nd1.getSum());
		System.out.println(nd2.getSum());
		

	}

}
