package lesOpdracht3;

public class Boek {
	private String isbn, titel;
	private int bladzijden;
	private Auteur auteur;
	
	public Boek() {
		this("ditiseenisbn", "De Titel", 1234, new Auteur());
	}

	public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
		setIsbn(isbn);
		setTitel(titel);
		setBladzijden(bladzijden);
		setAuteur(auteur);
	}
	
	public void toonBoekGegevens() {
		System.out.println("ISBN: " + this.isbn + " Titel: " + this.titel + 
				" Aantal bladzijden: " + this.bladzijden + "\n" + this.auteur.toString());
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getBladzijden() {
		return bladzijden;
	}
	public void setBladzijden(int bladzijden) {
		this.bladzijden = bladzijden;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
}
