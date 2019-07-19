package lesOpdracht1;

public class PetApp {

	public static void main(String[] args) {
		Owner eigenaar = new Owner("sinterklaas");
		Pet pet = new Pet("Blacky");
		eigenaar.setPet(pet);
		eigenaar.print();
		System.out.println(eigenaar.getNaam() +"heeft een dier met denaam" +eigenaar.getPet().getNaam());
		Owner eigenaar2 = new Owner("Dirk");
		
		eigenaar2.setPet(pet);
		//als je een object van iemand verandered dan moet je het toevoegen maar ook verwijderen bij het origneel object door null
		eigenaar.setPet(null);
		
		eigenaar2.getPet().setNaam("hondje");
		eigenaar2.print();
		
		//eens kijken of er bij de originele eigenaar iets veranderd is
		eigenaar.print();
	}

}
