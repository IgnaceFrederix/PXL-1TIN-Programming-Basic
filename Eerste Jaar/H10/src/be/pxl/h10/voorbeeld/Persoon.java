package be.pxl.h10.voorbeeld;

public class Persoon {
	private String naam;
	private String voornaam;
	private static int aantal;
	
	public Persoon(){
		aantal++;
	}
	
	public Persoon(String nm, String vn){
		naam = nm;
		voornaam = vn;
		aantal++;
	}

	public String getNaam() {
		return naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
	public void print(){
		System.out.println("voornaam" + voornaam + "naam"+ naam);
	}
	
	public static int getAantal(){
		return aantal;
	}
	

}
