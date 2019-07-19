package p34;

public class TextApp {

	public static void main(String[] args) {
		Text text = new Text("Hello this is an example of a sentence cotaining words");
		
		System.out.println("*** Words containing 'e' ***");
		text.printFilteredWords(new WordFilter(){
			public boolean isValid(String s){
				return s.contains("e");
			}
		});
		
		System.out.println("*** Words containing 'e' ***");
		text.printFilteredWords((String s)-> s.contains("e"));
		
		System.out.println("** Long Words ***");
		text.printFilteredWords(new WordFilter(){
			public boolean isValid(String s){
				return s.length() > 4;
			}
		});
		
		System.out.println("** Words starting with 'a' ****");
		text.printFilteredWords(new WordFilter(){
			public boolean isValid(String s){
				return s.startsWith("a");
			}
		});

	}

}
