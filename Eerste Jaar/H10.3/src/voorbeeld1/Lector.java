package voorbeeld1;

public class Lector extends Persoon {

	
	private String persooneelsNummer;
	private int aantstellingsPercentage;
	private double salaris;
	private static int aantal;
	
	
	
	
	public Lector(String naam, String voornaam, String personeelsNummer, int aanstellingsPercentage, double salaris){
		super(naam, voornaam);
		this.persooneelsNummer = personeelsNummer;
		this.aantstellingsPercentage = aantstellingsPercentage;
		this.salaris = salaris;
		aantal++;
	}
	
	public Lector(String naam, String voornaam,  int aanstellingsPercentage, double salaris){
		this(naam, voornaam, "200009", aanstellingsPercentage,salaris);
		
	}
	
	public Lector(){
		this("onbekend", "onbekend", "20000999", 2000, 100);
	}
	
	
	public String getPersooneelsNummer() {
		return persooneelsNummer;
	}
	public int getAantstellingsPercentage() {
		return aantstellingsPercentage;
	}
	public double getSalaris() {
		return salaris;
	}
	
	
	public void setPersooneelsNummer(String persooneelsNummer) {
		this.persooneelsNummer = persooneelsNummer;
	}
	public void setAantstellingsPercentage(int aantstellingsPercentage) {
		if(aantstellingsPercentage < 0){
			aantstellingsPercentage = 0;
		}else{
			if(aantstellingsPercentage > 100){
				aantstellingsPercentage =100;
			}
		}
		if(this.aantstellingsPercentage !=0 && salaris !=0){
			salaris = salaris* aantstellingsPercentage / this.aantstellingsPercentage;
		}
		this.aantstellingsPercentage = aantstellingsPercentage;
	}
	public void setSalaris(int salaris) {
		this.salaris = salaris;
	}
	
	public void print(){
		super.print();
		System.out.println(persooneelsNummer);
		System.out.println(salaris);
		System.out.println(aantstellingsPercentage);
		
		
	}
	public static int getAantal(){
		return aantal;
	}
}
