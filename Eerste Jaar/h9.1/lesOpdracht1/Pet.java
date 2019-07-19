package be.pxl.h9.lesOpdracht1;

public class Pet {
	String naam;
	
	public Pet() {
		this("dePet");
	}
	
	public Pet(String naam) {
		setNaam(naam);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
