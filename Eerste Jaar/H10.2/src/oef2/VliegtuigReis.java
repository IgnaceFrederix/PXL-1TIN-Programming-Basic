package oef2;

public  class VliegtuigReis extends Reis {
	private String vluchtnummer;
	private static double minPrijs = 25;

	public VliegtuigReis(String bestemming) {
		this(bestemming, getMinPrijs(), bestemming.substring(0, 1) + 999);
	}

	public VliegtuigReis(String bestemming, double prijs, String vluchtnummer) {
		super(bestemming);
		if (prijs < minPrijs) {
			super.prijs = minPrijs;
		} else {
			super.prijs = prijs;
		}
		setVluchtnummer(vluchtnummer);
	}

	public String getVluchtnummer() {
		return vluchtnummer;
	}

	public void setVluchtnummer(String vluchtnummer) {
		if (vluchtnummer.substring(0, 1).equals(getBestemming().substring(0, 1))) {
			this.vluchtnummer = vluchtnummer;
		} else {
			this.vluchtnummer = getBestemming().substring(0, 1) + vluchtnummer;
		}
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("Vliegtuigreis (vluchtnr %s)\n", this.vluchtnummer);
	}
}
