package p13;

public class Numberduo<E extends Number> {
	private E first;
	private E second;
	
	public Numberduo(E first, E second ){
		this.first = first;
		this.second = second;
	}

	public E getFirst() {
		return first;
	}

	public E getSecond() {
		return second;
	}

	public void setFirst(E first) {
		this.first = first;
	}

	public void setSecond(E second) {
		this.second = second;
	}
	public double getSum(){
		return first.doubleValue() + second.doubleValue();
	}
}

	
	
	