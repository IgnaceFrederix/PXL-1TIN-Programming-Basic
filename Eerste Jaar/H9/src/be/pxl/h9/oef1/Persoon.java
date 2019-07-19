package be.pxl.h9.oef1;

public class Persoon {
	
	private String naam;
	private String voornaam;
	private int dag;
	private int maand;
	private int jaar;
	private Datum dat = new Datum(dag, maand, jaar);
	private String straat, huisnr;
	private int postcode;
	private String gemeente;
	private Gemeente gem = new Gemeente(postcode, gemeente);
	private Adres ad = new Adres(straat, huisnr,postcode,gemeente);


	
	
	public	Persoon(String naam, String voornaam, int dag, int maand, int jaar, String straat, String huisnr, int postcode, String gemeente){
		this.naam = naam;
		this.voornaam = voornaam;
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		this.straat = straat;
		this.huisnr = huisnr;
		this.postcode = postcode;
		this.gemeente = gemeente;
	}
	public Persoon(){
		naam = "Aerts";
		voornaam = "jef";
		gemeente = "hasselt";
	}
	

	public String getNaam() {
		return naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public int getDag() {
		return dag;
	}

	public int getMaand() {
		return maand;
	}

	public int getJaar() {
		return jaar;
	}

	public String getStraat() {
		return straat;
	}

	public String getHuisnr() {
		return huisnr;
	}

	public int getPostcode() {
		return postcode;
	}

	public String getGemeente() {
		return gemeente;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public void setGemeente(String gemeente) {
		this.gemeente = gemeente;
	}
	
	
	 public  String voegVoornamenToe(String... extraVoornaam) {
			StringBuilder s1 = new StringBuilder();
		s1= s1.append(getVoornaam());
		for (String s : extraVoornaam) {
			
			s1 = s1.append(" " + s+" ");
		}
		return s1.toString();
		
	}
	
	public String toString(){
		return s1 + " "+ getNaam()+ "\n" + getStraat() + " " + getHuisnr()+ "\n"+ getPostcode()+ " " + getGemeente()+" \n" + getDag()+ " " + getMaand()+ " " +getJaar();
	}
	
		
	}
	
	
	
	
	


