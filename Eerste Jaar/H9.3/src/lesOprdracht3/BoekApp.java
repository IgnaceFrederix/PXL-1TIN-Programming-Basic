package lesOprdracht3;

public class BoekApp {

	public static void main(String[] args) {
		Boek goedBoek = new Boek();
		Auteur auteur = new Auteur();
		auteur.setNaam("Peeters");
		auteur.setVoornaam("Marnix");
		goedBoek.setAuteur(auteur);
		goedBoek.setIsbn("12645454");
		goedBoek.setTitel("het minstere van ");
		goedBoek.setBladzijden(1200);
		System.out.println(goedBoek.getAuteur().toString());
		goedBoek.toonBoekGegevens();
	}

}
