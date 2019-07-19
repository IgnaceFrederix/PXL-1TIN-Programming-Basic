package lesOpdracht3;

public class Auteur {
	private String naam, voornaam;

	public Auteur() {
		this("Janssen", "Jan");
	}

	public Auteur(String naam, String voornaam) {
		setNaam(naam);
		setVoornaam(voornaam);
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
	
	@Override
	public String toString() {
		return "Auteur: " + this.voornaam + " " + this.naam;
	}

}
