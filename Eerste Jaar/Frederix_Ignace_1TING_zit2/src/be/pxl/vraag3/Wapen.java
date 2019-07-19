package be.pxl.vraag3;

public class Wapen extends Voorwerp {

	
	 private int aanvalswaarde;
	 private int aanvalswaardeElement;
	
	public Wapen(Element e, int aanvalswaarde, int aanvalswaardeElement  ) {
		super(e);
		this.aanvalswaarde = aanvalswaarde;
		this.aanvalswaardeElement = aanvalswaardeElement;
		
	}

	public int getAanvalswaarde() {
		return aanvalswaarde;
	}

	public int getAanvalswaardeElement() {
		return aanvalswaardeElement;
	}
	
	

}
