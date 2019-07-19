package be.pxl.h9.opdracht3;

public class Auteur {
	
	private String naam;
	private String voornaam;
	
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
	public String toString(){
		return naam + " " + voornaam;
	}

}
