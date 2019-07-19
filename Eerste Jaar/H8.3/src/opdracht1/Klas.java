package opdracht1;

public class Klas {
	private String naam;
	private int aantal;
	public static int max;  //klasse variable
	public static int count;
	
	{
		count++;
	}
	static {//static initialistie 
		max = 40;
		
	}
	
	public Klas(){//default constructor
	//naam = "1TINx";
	this("1TINX",0);
		
	}
	
	public Klas(String naam, int aantal){
		this.naam = naam;
		setAantal(aantal);
	}

	public String getNaam() {
		return naam;
	}

	public int getAantal() {
		return aantal;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setAantal(int aantal) {
		if(aantal > max){
			aantal = max;
		}
		this.aantal = aantal;
	}
	
	
	
	
	

}
