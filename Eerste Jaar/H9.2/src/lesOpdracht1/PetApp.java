package lesOpdracht1;

public class PetApp {

	public static void main(String[] args) {
		Owner eigenaar = new Owner();
		Pet pet = new Pet("Blacky");
		eigenaar.setPet(pet);
		eigenaar.print();
		
		Owner eigenaar2 = new Owner("Dirk");
		eigenaar2.setPet(pet);
		eigenaar2.getPet().setNaam("hondje");
		eigenaar2.print();
		
		//eens kijken of er bij de originele eigenaar iets veranderd is
		eigenaar.print();
	}

}
