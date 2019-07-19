package p29;

public class Outer {
	public Object getInner(){
		final int a=5;
		class Inner {
			public String toString(){
				
				return "Inner " + a;
			}
		}
		return new Inner();
	}

}
