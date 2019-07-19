package opdracht1;

public enum Dag {

	MAANDAG("weekdag"), 
	DINSDAG("weekdag"), 
	WOENSDAG("weekdag"), 
	DONDERDAG("weekdag"), 
	VRIJDAG("weekdag"), 
	ZATERDAG("weekend"), 
	ZONDAG("weekend");

	private String typeDag;

	private Dag(String typeDag) {
		this.typeDag = typeDag;
	}
	
	@Override
	public String toString() {
		return this.name().toLowerCase() + " " + this.typeDag;
	}
}
