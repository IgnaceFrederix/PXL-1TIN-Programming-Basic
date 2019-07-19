package oef1;

public class Manager extends Werknemer {
	private int bonus;
	private static int aantalManagers = 0;

	public Manager(String naam, String voornaam, int salaris, String functie) {
		this(naam, voornaam, salaris, functie, 50);
	}

	public Manager(String naam, String voornaam, int salaris, String functie, int bonus) {
		super(naam, voornaam, salaris, functie);
		setBonus(bonus);
		aantalManagers++;
	}

	public static int getAantalManagers() {
		return aantalManagers;
	}

	@Override
	public int getSalaris() {
		return super.getSalaris() + this.bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public static double getProcAandeelManagers() {
		double procAandeelManagers;
		procAandeelManagers = (double) aantalManagers / getAantalWerknemers();
		procAandeelManagers = Math.round(procAandeelManagers * 10000) / 100.0;
		return procAandeelManagers;
	}

}
