package oef1;


public class Persoon {
	private String naam, voornaam;
	private Adres adr;
	private Datum geboorteDatum;
	
	public Persoon() {
		this("Aerts", "Jef", 29, 11, 1990, "lindestraat", "23D", 3500, "Hasselt");
	}

	public Persoon(String naam, String voornaam, int d, int m, int j, String straat, String huisNr, int postcode,
			String gemNaam) {
		this(naam, voornaam, new Datum(d, m, j), new Adres(straat, huisNr, postcode, gemNaam));
	}

	public Persoon(String naam, String voornaam, Datum geboorteDatum, Adres adr) {
		setNaam(naam);
		setVoornaam(voornaam);
		setAdr(adr);
		this.geboorteDatum = geboorteDatum;
	}
	
	@Override
	public String toString() {
		return voornaam + " " + naam + "\n" + adr.toString();
	}
	
	public void voegVoornamenToe(String... voornamen) {
		StringBuilder sb = new StringBuilder();
		sb.append(this.voornaam);
		for (String voornaam : voornamen) {
			sb.append(" ");
			sb.append(voornaam);
		}
		this.voornaam = sb.toString();
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public Adres getAdr() {
		return adr;
	}

	public void setAdr(Adres adr) {
		this.adr = adr;
	}

	public Datum getGeboorteDatum() {
		return geboorteDatum;
	}
}
