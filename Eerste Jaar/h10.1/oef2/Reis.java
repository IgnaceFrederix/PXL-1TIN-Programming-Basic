package be.pxl.h10.oef2;

public abstract class Reis {
	private static double minPrijs = 5;
	protected double prijs;
	private String bestemming;

	public Reis(String bestemming) {
		this(bestemming, minPrijs);
	}

	public Reis(String bestemming, double prijs) {
		setBestemming(bestemming);
		setPrijs(prijs);
	}
	
	public static double getMinPrijs() {
		return minPrijs;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		if (prijs < minPrijs) { 
			this.prijs = minPrijs;
		} else {
			this.prijs = prijs;
		}
	}

	public String getBestemming() {
		return bestemming;
	}

	public void setBestemming(String bestemming) {
		Boolean letterGevonden = false;
		int teller = 0;
		while (!letterGevonden) {
			int beginTeller = teller;
			for (int i = 0; i < 10; i++) {
				if (bestemming.substring(teller, teller+1).equals(""+i)) {
					teller++;
					break;
				}
			}
			if (beginTeller == teller) {
				letterGevonden = true; 
			}
		}
		this.bestemming = bestemming.substring(teller);
	}

	public void print() {
		System.out.printf("Reis met bestemming %s kost %2.2f.\n", this.bestemming, this.prijs);
	}

}
