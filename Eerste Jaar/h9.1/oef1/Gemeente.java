package be.pxl.h9.oef1;

public class Gemeente {
	private int postcode;
	private String gemNaam;
	
	public Gemeente() {
		this(9870547, "hE78rk 89dE-Stad");
	}

	public Gemeente(int postcode, String gemNaam) {
		setPostcode(postcode);
		setGemNaam(gemNaam);
	}
	
	public int getPostcode() {
		return postcode;
	}
	
	public void setPostcode(int postcode) {
		while (postcode < 1000) {
			postcode *= 10;
		}
		while (postcode > 9999) {
			postcode /= 10;
		}
		this.postcode = postcode;
	}
	
	public String getGemNaam() {
		return gemNaam;
	}
	
	public void setGemNaam(String gemNaam) {
		gemNaam = gemNaam.replaceAll(" ", "-");
		for (int i = 0; i < 10; i++) {
			gemNaam = gemNaam.replaceAll("" + i, "");
		}
		String[] woorden = gemNaam.substring(0).split("-");
		gemNaam = gemNaam.substring(0, 1).toUpperCase();
		Boolean eerstWoord = true;
		for (String woord : woorden) {
			if (eerstWoord) {
				gemNaam += woord.substring(1).toLowerCase();
			} else {
				gemNaam += "-" + woord.substring(0, 1) + woord.substring(1).toLowerCase();
			}
			eerstWoord = false;
		}
		this.gemNaam = gemNaam;
	}
	
	@Override
	public String toString() {
		return this.postcode + " " + this.gemNaam;
	}
	
}
