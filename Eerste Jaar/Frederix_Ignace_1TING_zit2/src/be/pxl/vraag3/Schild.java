package be.pxl.vraag3;

public class Schild extends Voorwerp {
	
	private int verdedigingswaarde;
	private int verdedigingswaardElement;

	public Schild(Element e, int verdedigingswaarde, int verdedigingswaardElement) {
		super(e);
		this.verdedigingswaarde = verdedigingswaarde;
		this.verdedigingswaardElement = verdedigingswaardElement;
		
	}

	public int getVerdedigingswaarde() {
		return verdedigingswaarde;
	}

	public int getVerdedigingswaardElement() {
		return verdedigingswaardElement;
	}

}
