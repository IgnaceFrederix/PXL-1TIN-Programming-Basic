package p15;

public class ComparableDuo<E extends Comparable<E>> {
	private E first;
	private E second;
	
	public ComparableDuo(E first, E second ){
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
	public E getHighest(){
		return (first.compareTo(second)<0)?second:first;
	}

}
