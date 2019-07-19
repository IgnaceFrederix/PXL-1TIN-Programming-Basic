package lesOpdracht3;

public class BoekApp {

	public static void main(String[] args) {
		Boek goedBoek = new Boek();
		System.out.println(goedBoek.getAuteur().toString());
		goedBoek.toonBoekGegevens();
	}

}
