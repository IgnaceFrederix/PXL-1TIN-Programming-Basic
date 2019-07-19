package be.pxl.vraag3;

public class PersooonApp {

	public static void main(String[] args) {
		Persoon p = new Persoon (new Wapen(Element.VUUR,12,2),new Schild(Element.WATER,2,2),10);
		
		
		Persoon p1 = new Persoon (new Wapen(Element.WATER,3,1),new Schild(Element.VUUR,2,1),20);
p.valAan(p1);
System.out.println(p.getLevenspunten());
System.out.println(p1.getLevenspunten());
	}

}
