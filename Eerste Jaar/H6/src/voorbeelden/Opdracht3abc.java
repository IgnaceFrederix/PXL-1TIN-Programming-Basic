package voorbeelden;

public class Opdracht3abc {

	public static void main(String[] args) {
		String txt = "bijna is de les voorbij";
		int len;
		len = txt.length();
		System.out.println(txt +"\ndeze testk bevat" + len +"karakerts");
		txt = txt.toUpperCase();
		System.out.println(txt);
		txt = txt.toLowerCase();
		System.out.println(txt);
	}

}
