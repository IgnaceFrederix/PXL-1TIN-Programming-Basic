package oef1;

public class Adres {
	private String straat, huisNr;
	private Gemeente gemeente;
	
	public Adres() {
		this("kerkstraat", "12b", new Gemeente(3290, "Diest"));
	}
	
	public Adres(String straat, String huisNr, int postcode, String gemNaam) {
		this(straat, huisNr, new Gemeente(postcode, gemNaam));
	}

	public Adres(String straat, String huisNr, Gemeente gemeente) {
		setStraat(straat);
		setHuisNr(huisNr);
		this.gemeente = gemeente;
	}
	
	@Override
	public String toString() {
		return straat + " " + huisNr + "\n" + gemeente.toString() ;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getHuisNr() {
		return huisNr;
	}

	public void setHuisNr(String huisNr) {
		this.huisNr = huisNr;
	}

	public Gemeente getGemeente() {
		return gemeente;
	}

}
