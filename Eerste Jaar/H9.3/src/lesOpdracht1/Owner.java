package lesOpdracht1;

public class Owner {
	private String naam;
	private Pet pet;
	
	public Owner() {
		this("Jos");
	}
	
	public Owner(String naam) {
		setNaam(naam);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void print() {
		System.out.println("Eigenaar:\t" + this.naam + "\nPet:\t" + this.pet.getNaam());
	}
}
