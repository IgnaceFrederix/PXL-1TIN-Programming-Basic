package p15;

public class ShoeApp {

	public static void main(String[] args) {
		Shoe leftShoe = new Shoe(39);
		Shoe rightShoe = new Shoe(40);
		Pair<Shoe> pair = new ShoePair(leftShoe, rightShoe);
		
		
	}

}
