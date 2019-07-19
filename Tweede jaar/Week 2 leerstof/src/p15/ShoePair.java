package p15;

public class ShoePair implements Pair<Shoe> {
	private Shoe leftShoe;
	private Shoe rightShoe;
	
	public ShoePair(Shoe left, Shoe right){
		leftShoe = left;
		rightShoe = right;
	
	}
	public Shoe getLeft(){
		return leftShoe;
	}
	@Override
	public Shoe getRight(){
		return rightShoe;
	}

}
