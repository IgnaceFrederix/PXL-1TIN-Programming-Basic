package p13;

public class MumberduoApp {

	public static void main(String[] args) {
		Numberduo<Integer> nd1 = new Numberduo<>(3,5);
		Numberduo<Double> nd2 = new Numberduo<>(3.2,5.8);
		Numberduo<Number> nd3 = new Numberduo<>(3.2,5);
		
		System.out.println(nd1.getSum());
		System.out.println(nd2.getSum());
		System.out.println(nd3.getSum());
		
		NumberduoInt test = new NumberduoInt(5,5);
		System.out.println(test.getFirst());

	}

}
