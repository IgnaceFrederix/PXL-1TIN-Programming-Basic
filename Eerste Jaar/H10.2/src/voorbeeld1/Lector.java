package voorbeeld1;

public class Lector extends Persoon {
	private int personeelsNr, aanstellingsPercentage;
	private double salaris;
	
	public Lector() {
		this("jos", "joske", 100, 2000, 20009999);
	}
	
	public Lector(String naam, String voornaam) {
		super(naam, voornaam);
	}
	
	public Lector(String naam, String voornaam, int aanstellingsPercentage, double salaris) {
		this(naam, voornaam);
		setAanstellingsPercentage(aanstellingsPercentage);
		setSalaris(salaris);
	}
	
	public Lector(String naam, String voornaam, int aanstellingsPercentage, double salaris, int personeelsNr) {
		this(naam, voornaam, aanstellingsPercentage, salaris);
		setPersoneelsNr(personeelsNr);
	}
	
	public int getPersoneelsNr() {
		return personeelsNr;
	}
	
	public void setPersoneelsNr(int personeelsNr) {
		this.personeelsNr = personeelsNr;
	}
	
	public int getAanstellingsPercentage() {
		return aanstellingsPercentage;
	}
	
	public void setAanstellingsPercentage(int aanstellingsPercentage) {
		if (this.aanstellingsPercentage > 0 && this.aanstellingsPercentage < 100) {
			if (this.aanstellingsPercentage != 0 && this.salaris != 0) {
				this.salaris = (this.salaris/this.aanstellingsPercentage * 100) * (aanstellingsPercentage/100);
				this.aanstellingsPercentage = aanstellingsPercentage;
			} else {
				this.aanstellingsPercentage = aanstellingsPercentage;
			}
		}
	}
	
	public double getSalaris() {
		return salaris;
	}
	
	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}
}
