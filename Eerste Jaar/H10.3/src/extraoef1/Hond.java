package extraoef1;

public class Hond extends Dier {

	private String naam;
	private String ras;
	
	
	public Hond(String naam){
		super("hond", "carnivoor");
		ras = "straathond";
		this.naam = naam;
	}
	public Hond(String naam, String ras, int geboorteJaar) {
		super("hond", "carnivoor", geboorteJaar);
		this.naam = naam;
		this.ras = ras;
		
	}
	
	@Override
	public String toString(){
		return naam+ "" + ""+ras;
		
	}
	
	
	

}
