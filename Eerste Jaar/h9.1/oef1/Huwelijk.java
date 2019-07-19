package be.pxl.h9.oef1;

public class Huwelijk {
	private Datum huwelijksDatum;
	private Persoon[] partners = new Persoon[2];
	
	public Huwelijk(Persoon partner1, Persoon partner2, int d, int m, int j) {
		partner2.setAdr(partner1.getAdr());
		this.partners[0] = partner1;
		this.partners[1] = partner2;
		this.huwelijksDatum = new Datum(d, m, j);
		System.out.printf("%s %s en %s %s zijn gehuwd op ", 
				partner1.getVoornaam(), partner1.getNaam(), partner2.getVoornaam(), partner2.getNaam());
		this.huwelijksDatum.print();
		System.out.println(". Proficiat!");
	}

	public void adresWijziging(String straat, String huisNr, int postcode, String gemNaam) {
		Adres nieuwAdres = new Adres(straat, huisNr, postcode, gemNaam);
		this.partners[0].setAdr(nieuwAdres);
		this.partners[1].setAdr(nieuwAdres);
	}
	
	public void print() {
		for (int i = 0; i < partners.length; i++) {
			System.out.println(partners[i].toString());
			partners[i].getGeboorteDatum().print();
			System.out.println("\n");
		}
		System.out.print("het huwelijk vond plaats op ");
		this.huwelijksDatum.print();
		System.out.println();
	}
	
	public Datum getHuwelijksDatum() {
		return huwelijksDatum;
	}

	public void setHuwelijksDatum(Datum huwelijksDatum) {
		this.huwelijksDatum = huwelijksDatum;
	}

	public Persoon getPartner1() {
		return partners[0];
	}

	public Persoon getPartner2() {
		return partners[1];
	}
}
