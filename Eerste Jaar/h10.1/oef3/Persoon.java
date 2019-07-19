package be.pxl.h10.oef3;

public class Persoon {
	private String naam, voornaam;
	private static int aantalPersonen = 0;
	
	public Persoon(String naam, String voornaam) { 
		setNaam(naam);
		setVoornaam(voornaam);
		aantalPersonen++;
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

	public static int getAantalPersonen() {
		return aantalPersonen;
	}

}
