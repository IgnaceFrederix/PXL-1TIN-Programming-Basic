package be.pxl.h9.oef1;

public class HuwelijkApp {

	public static void main(String[] args) {
		Gemeente g1 = new Gemeente(32782,"teS");
		Adres a1 = new Adres("kerkstaart","12b",3275,"diest");
		System.out.println(g1.toString());
		System.out.println(a1.toString());
		Huwelijk h1 = new Huwelijk("testman", "testvrouw",5,5,5);
	Persoon p1 = new Persoon("naam","voornaam",5,5,5,"staart","huisnr",5,"gemeente");
	p1.setGemeente("nieuwe gemeente");
	p1.setJaar(1995);
	p1.voegVoornamenToe("naam2","naam3");
	System.out.println(p1.toString());
		Datum d1 = new Datum(5,4,2016);
		d1.print();
		h1.print();
		
	}

}
