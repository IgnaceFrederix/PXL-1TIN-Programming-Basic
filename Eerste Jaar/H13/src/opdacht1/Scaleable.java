package opdacht1;

public interface Scaleable {
	//constene public static en final
	int HALF = 50;
	int DOUBLE = 200;
	int QUATER =25;
	//methoden deze zijn impliciet public abstract
	void scale(int factor);
	
	// default methoonde 
	public default void scaleDouble(){
		scale(DOUBLE);
	}
	public default void scaleHALF(){
		scale(HALF);
	}

}
