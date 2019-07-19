package extraoef1;

public class Munt {
	
	private String naam;
	private double koers;
	private static final int AFRONDING =3;
	private static int aantal;
	
	{
		aantal++;
	}
	public Munt(){
		naam = "euro";
		koers =1;
	}
	
	public Munt(String n, double k){
		naam = n;
		koers = k;
		
	}
	

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setKoers(double koers) {
		this.koers = koers;
	}

	public String getNaam() {
		return naam;
	}

	public double getKoers() {
		return koers;
	}

	public static int getAfronding() {
		return AFRONDING;
	}

	public static int getAantal() {
		return aantal;
	}
	
	

}
