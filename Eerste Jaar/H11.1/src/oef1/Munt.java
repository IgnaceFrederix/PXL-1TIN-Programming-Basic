package oef1;

public enum Munt {
	TWEEHONDERD(200, "2 euro"),
	HONDERD(100, "1 euro"),
	VIJFTIG(50, "50 cent"),
	TWINTIG(20, "20 cent"),
	TIEN(10, "10 cent"),
	VIJF(5, "5 cent"),
	TWEE(2, "2 cent"),
	EEN(1, "1 cent");
	
	private int waarde;
	private String naam;
	
	private Munt(int waarde, String naam) {
		this.waarde = waarde;
		this.naam = naam;
	}
	
	public int getWaarde() {
		return this.waarde;
	}
	
	public int getNaam() {
		return this.waarde;
	}
	
	@Override
	public String toString() {
		return this.naam;
	}
}
