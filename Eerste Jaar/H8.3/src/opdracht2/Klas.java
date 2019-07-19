package opdracht2;

public class Klas {
	private String naam;
	private int aantal;
	public static final int MAX;  //klasse variable
	private static int count;
	private static int totaanStud = 0;
	
	
	{
		count++;
	}
	static {//static initialistie 
		MAX = 40;
		
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
	
	

	public static int getCount() {
		return count;
	}
	
	

	public static int getTotaanStud() {
		return totaanStud;
	}

	public static void setTotaanStud(int totaanStud) {
		Klas.totaanStud = totaanStud;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setAantal(int aantal) {
		if(aantal > MAX){
			aantal = MAX;
		}
		totaanStud += aantal;
		this.aantal = aantal;
	}
	
	
	
	
	

}
