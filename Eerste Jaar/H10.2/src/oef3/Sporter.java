package oef3;

public class Sporter extends Persoon {
	private String beoefendeSport;
	private static int aantalSporters = 0;

	public Sporter(String naam, String voornaam) {
		this(naam, voornaam, "onbekend");
	}
	
	public Sporter(String naam, String voornaam, String beoefendeSport) {
		super(naam, voornaam);
		setBeoefendeSport(beoefendeSport);
		aantalSporters++;
	}
	
	public String getBeoefendeSport() {
		return beoefendeSport;
	}

	public void setBeoefendeSport(String beoefendeSport) {
		this.beoefendeSport = beoefendeSport;
	}
	
	public static int getAantalSporters() {
		return aantalSporters;
	}

	public void print() {
		System.out.printf("%s %s\n%s\n", getVoornaam(), getNaam(), getBeoefendeSport());
	}
}
