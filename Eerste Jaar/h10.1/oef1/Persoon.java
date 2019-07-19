package be.pxl.h10.oef1;

public class Persoon {
	private String naam, voornaam;
	
	public Persoon(String naam, String voornaam) {
		setNaam(naam);
		setVoornaam(voornaam);
	}
	
	public void print() {
		System.out.println(this.naam + " " + this.voornaam);
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
}
