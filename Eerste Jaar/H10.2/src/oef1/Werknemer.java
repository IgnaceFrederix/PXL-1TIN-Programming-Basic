package oef1;

public class Werknemer extends Persoon {
	private String functie;
	private int salaris;
	private static final int MINSALARIS = 1000;
	private static int aantalWerknemers = 0;

	public Werknemer(String naam, String voornaam) {
		this(naam, voornaam, 1800, "Algemeen Bediende");
	}

	public Werknemer(String naam, String voornaam, int salaris, String functie) {
		super(naam, voornaam);
		setFunctie(functie);
		setSalaris(salaris);
		aantalWerknemers++;
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public int getSalaris() {
		return salaris;
	}

	public void setSalaris(int salaris) {
		if (salaris < MINSALARIS) {
			this.salaris = MINSALARIS;
		} else {
			this.salaris = salaris;
		}
	}

	public static int getAantalWerknemers() {
		return aantalWerknemers;
	}

	public static int getMinsalaris() {
		return MINSALARIS;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Functie: " + this.functie + " Salaris: " + getSalaris());
	}
}
