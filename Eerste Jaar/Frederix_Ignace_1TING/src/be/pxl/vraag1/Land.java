package be.pxl.vraag1;

public enum Land {
	LYONESSE,
	DAYHAUT,
	POMPEROL,
	BLALOC;
	
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}

}
