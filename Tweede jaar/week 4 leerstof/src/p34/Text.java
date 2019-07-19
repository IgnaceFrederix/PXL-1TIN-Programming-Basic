package p34;

public class Text {
	private String sentence;
	public Text(String sentence){
		this.sentence = sentence;
	}
	
	public void printFilteredWords(WordFilter filter){
		for (String w : sentence.split(" ")){
			if(filter.isValid(w)){
				System.out.println(w);
			}
		}
		
	}
	
	public void printProcesedWords(WordProcessor processor){
		for (String w : sentence.split(" ")){
			System.out.println(processor.process(w));
		}
	}
	
	public void printNumberValues(NumberParser parser){
		for(String w : sentence.split(" ")){
			System.out.format("%,d%n", parser.parse(w));
		}
	}

	
}
