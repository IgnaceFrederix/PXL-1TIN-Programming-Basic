package p15;

public class GeneralPairApp {

	public static void main(String[] args) {
		Shoe leftShoe = new Shoe(39);
		Shoe rightShoe = new Shoe(39);
		GeneralPair<Shoe> pair = new GeneralPair<>(leftShoe, rightShoe);
	}

}
