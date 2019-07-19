package oef2;


public class Leraar {
	private String naam, voornaam;
	private int aanstellingsPerc, aantalvakken;
	private static final int MAXAANTALVAKKEN = 5;
	private Vak[] vakken = new Vak[MAXAANTALVAKKEN];
	
	public Leraar(String naam, String voornaam, int aanstellingPerc) {
		this.aantalvakken = 0;
		setNaam(naam);
		setVoornaam(voornaam);
		setAanstelling(aanstellingPerc);
	}
	
	public void print() {
		System.out.printf("Leraar %s %s is aangesteld voor %d%%\n", this.naam, this.voornaam, this.aanstellingsPerc);
		System.out.println("Volgend vakken behoren tot het takenpakket: ");
		for (int i = 1; i <= 3; i++) {
			System.out.printf("Vakken van jaar %d:\n", i);
			for (int j = 0; j < aantalvakken; j++) {
				if (Integer.parseInt(vakken[j].getJaar()) == i) {
					if (vakken[j].getNaam().length() > 15) {
						System.out.printf("\t%s\t%s\t%d\n",vakken[j].getCode(), vakken[j].getNaam(), vakken[j].getAantalSTP());
					} else {
						System.out.printf("\t%s\t%s\t\t%d\n",vakken[j].getCode(), vakken[j].getNaam(), vakken[j].getAantalSTP());
					}
				}
			}
		}
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAanstelling() {
		return aanstellingsPerc;
	}

	public void setAanstelling(int aanstellingsPerc) {
		if (aanstellingsPerc > 100) {
			System.out.println("Een leraar kan maximaal 100% aangesteld zijn");
		}
		if (aanstellingsPerc % 10 < 5 && aanstellingsPerc % 10 > 0) {
			aanstellingsPerc -= aanstellingsPerc % 10;
		} else if (aanstellingsPerc > 4) {
			aanstellingsPerc += 10 - aanstellingsPerc % 10;
		}
		this.aanstellingsPerc = aanstellingsPerc;
	}

	public Vak getVak(int i) {
		return vakken[i];
	}

	public void voegVakToe(Vak vak) {
		Boolean toevoegen = true;
		if (aantalvakken == MAXAANTALVAKKEN) {
			toevoegen = false;
		}
		for (int i = 0; i < vakken.length; i++) {
			if (vakken[i] == vak) {
				toevoegen = false;
			}
		}
		if (toevoegen) {
			this.vakken[aantalvakken] = vak;
			this.aantalvakken++;
		}
	}

	public int getAantalvakken() {
		return aantalvakken;
	}

	public static int getMAX() {
		return MAXAANTALVAKKEN;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
}
