package be.pxl.h10.oef1;

public class Manager extends Werknemer {
	
	double bonus;
	public Manager(String naam, String voornaam, String functie, double salaris, double bonus){
		super(naam,voornaam,functie,salaris);
		this.bonus = bonus;
		
		
	}
	public Manager(String naam, String voornaam, String functie, double salaris){
		super(naam,voornaam,functie,salaris);
		this.bonus = 50;
		
		
	}
	public double getBonus() {
		
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//@Override
	public double getSalaris(){
		return getSalaris()+getBonus();
	}
	
	
	
	
}
