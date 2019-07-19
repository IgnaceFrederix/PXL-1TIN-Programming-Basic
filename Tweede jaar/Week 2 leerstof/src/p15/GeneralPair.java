package p15;

public class GeneralPair<E> implements Pair<E> {
	private E left;
	private E right;
	
	public GeneralPair(E left, E right){
		this.left = left;
		this.right = right;
	
	}
	public E getLeft(){
		return left;
	}
	@Override
	public E getRight(){
		return right;
	}

}