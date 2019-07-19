package p15;

import p13.Duo;

public class DuoUtitlityApp {

	public static void main(String[] args) {
		Duo<Integer> id = new Duo<>(7,5);
		Duo<Long> ld = new Duo<>(746987L,546358L);
		Duo<Float> fd = new Duo<>(5.7F,8.9F);
		Duo<Number> nd = new Duo<>(4,8.56D);
		
		DuoUtitlity.printSum(id);
		DuoUtitlity.printSum(ld);
		DuoUtitlity.printSum(fd);
		DuoUtitlity.printSum(nd);
		
		
		Duo<String> d1 = new Duo<>("Hello","World");
		Duo<String> d2 = new Duo<>("Goodbye", "Mars");
		
		DuoUtitlity.swapFirst(d1,d2);
		DuoUtitlity.printDuotwee(d1);
		DuoUtitlity.printDuotwee(d2);

	}
	
}
