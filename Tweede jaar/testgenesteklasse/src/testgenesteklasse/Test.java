package testgenesteklasse;

public class Test {
	public Object getInner(){
		
	
	int a =5;
	class Inner{
		public String toString(){
		//	a++;
			return a+" testr";
		}
	
	}
	return new Inner();
	}
}
