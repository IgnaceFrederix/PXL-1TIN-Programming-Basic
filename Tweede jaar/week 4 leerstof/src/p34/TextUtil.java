package p34;

public interface TextUtil {
	public static String quote (String s){
		return String.format("<<%s>>", s);
	}
}
