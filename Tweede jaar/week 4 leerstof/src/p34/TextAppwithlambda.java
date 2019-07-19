package p34;

public class TextAppwithlambda {

	public static void main(String[] args) {
		
		final String c="e";
		
		Text text = new Text("Hello this is an example of a sentence cotaining words");
		
		//met lambda expreccion
		System.out.println("*** Words containing 'e' ***");
		text.printFilteredWords((String s)-> s.contains(c));
		
		System.out.println("** Long Words ***");
		text.printFilteredWords((s -> s.length() > 4));
		
		System.out.println("** Words starting with 'a' ****");
		text.printFilteredWords((String s) -> s.startsWith("a"));
		
		text.printProcesedWords(s -> String.format("<<%s>>", s));
		text.printProcesedWords(s -> TextUtil.quote(s));
		//of korter met lambda
		text.printProcesedWords(TextUtil::quote);
		
		//padder
		TextPadder padder = new TextPadder(20);
		text.printProcesedWords(s -> padder.pad(s));
		text.printProcesedWords(s -> s.toUpperCase());
		
		Text text2 = new Text("1145 236 9852 3658");
		text2.printNumberValues(s -> new Long(s));
		
		text.printFilteredWords(s -> s.contains("e"));
		text.printProcesedWords(s -> s.toUpperCase());
		text.printNumberValues(s -> new Long(s));

	}

}
