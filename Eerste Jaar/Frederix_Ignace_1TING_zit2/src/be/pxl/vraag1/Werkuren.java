package be.pxl.vraag1;
/*
 * Ignace Frederix
 * 1TING
 */

public class Werkuren implements Verkoopbaar {
	
	private double prijsPerUur;
	private int aantalUren;
	
	public Werkuren(double prijsPerUur, int aantalUren){
		this.prijsPerUur = prijsPerUur;
		this.aantalUren = aantalUren;
	}
	
	
	
	public double getPrijsPerUur() {
		return prijsPerUur;
	}



	public int getAantalUren() {
		return aantalUren;
	}



	public String toString(){
		return prijsPerUur+" euro per uur, "+aantalUren+" uren";
	}

}
