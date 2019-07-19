package be.pxl.h9.opdracht3;

public class Boek {
	private String isbn;
	private String titel;
	private int bldz;
	private Auteur auteur;
	
	public Boek(){
		auteur = new Auteur();
	}
	public Boek(String isbn, String title, int bldz, Auteur a){
		this.isbn = isbn;
		this.titel = titel;
		this.bldz = bldz;
		auteur = a;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public String getTitel() {
		return titel;
	}
	public int getBldz() {
		return bldz;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public void setBldz(int bldz) {
		this.bldz = bldz;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	public void toonBoekGegevens(){
		System.out.println("isbn :"+ isbn);
		System.out.println("titel : " + titel);
		System.out.println("auteur : "+ auteur.toString());
		System.out.println("aantal pagina's " + bldz);
	}

}
