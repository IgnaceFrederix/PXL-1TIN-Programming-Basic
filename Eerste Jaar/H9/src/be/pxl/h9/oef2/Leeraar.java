package be.pxl.h9.oef2;

public class Leeraar {


	private String naam;
	private String voornaam;
	private int aanstellingsPerc;
	private int aantalVakken;
	private  static int maxaantalvakken=5;
	private Vak vakken[]; 
	
	public Leeraar(String naam, String voornaam, int aanstellingsPerc){
		this.naam = naam;
		this.voornaam = voornaam;
		this.aanstellingsPerc = aanstellingsPerc;
		vakken = new Vak[5];;
	}


	public String getNaam() {
		return naam;
	}


	public String getVoornaam() {
		return voornaam;
	}


	public int getAanstellingsPerc() {
		if(aanstellingsPerc > 100)
		{
			aanstellingsPerc =100;
			System.out.println("fout ingegeven pecentage");
			
		}
		if(aanstellingsPerc % 10 !=0)
		{
			aanstellingsPerc=(aanstellingsPerc/10)*10;
		}
		
		return aanstellingsPerc;
	}


	public int getAantalVakken() {
		if(aantalVakken >5){
			System.out.println("je hebt te veel vakken");
		}
		return aantalVakken;
	}


	public int getMaxaantalvakken() {
		return maxaantalvakken;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public void setAanstellingsPerc(int aanstellingsPerc) {
		this.aanstellingsPerc = aanstellingsPerc;
	}


	public void setAantalVakken(int aantalVakken) {
		this.aantalVakken = aantalVakken;
	}


	public void setMaxaantalvakken(int maxaantalvakken) {
		this.maxaantalvakken = maxaantalvakken;
	}
	
	

}
