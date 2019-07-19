package be.pxl.h10.oef1;

import be.pxl.h10.voorbeeld.Persoon;

public class Werknemer extends Persoon {
	
	String functie;
	double salaris;
	int teller;
	
	{
		teller++;
	}
	
	
	
	
	public Werknemer(String naam, String voornaam,String functie, double salaris){
		super(naam,voornaam);
		this.functie = functie;
		setSalaris(salaris);
		
	}
	public Werknemer(String naam, String voornaam){
		super(naam,voornaam);
		this.functie = "algemeen bediende";
		this.salaris = 1800;
	}
	
	public String getFunctie() {
		return functie;
	}
	public double getSalaris() {
		
		return salaris;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	public void setSalaris(double salaris) {
		if(salaris < 1000){
			salaris =1000;
		}
		this.salaris = salaris;
	}
	
	public  void print(){
		System.out.println(super.getNaam());
		System.out.println(super.getVoornaam());
		
		System.out.println(salaris);
		System.out.println(functie);
	}
	
	
	
	

}
