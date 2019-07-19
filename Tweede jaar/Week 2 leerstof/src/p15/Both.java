package p15;

public class Both<E extends Number & Comparable> {
	private E first;
	private E second;
	
	public Both(E first, E second ){
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
