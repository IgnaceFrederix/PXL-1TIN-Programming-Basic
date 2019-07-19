package voorbeelden;

public class Opdracht4 {

	public static void main(String[] args) {
		StringBuilder tekst1 = new StringBuilder("this is my first line of text");
		System.out.println(tekst1);
		StringBuilder tekst2 = new StringBuilder("this is my second line of text");
		System.out.println(tekst2);
		tekst1.append("and this is what i added");
		System.out.println(tekst1);
		tekst2.reverse();
		System.out.println(tekst2);
		int pos =tekst1.indexOf(" ");
		
		System.out.println(tekst1);
		while(pos!=-1){
			tekst1.deleteCharAt(pos);
			pos = tekst1.indexOf(" ");
		}
		System.out.println(tekst1);
		pos = tekst2.indexOf("t");
		while(pos != -1)
		{
			tekst2.insert(pos, 't');
			pos = tekst2.indexOf("t",pos+2);
		}
		System.out.println(tekst2);
	}

}
