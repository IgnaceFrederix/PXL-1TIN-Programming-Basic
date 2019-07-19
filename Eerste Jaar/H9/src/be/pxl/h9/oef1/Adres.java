package be.pxl.h9.oef1;

public class Adres {

	private String straat, huisnr;
	private int postcode;
	private String gemeente;
	private Gemeente gem ; 
	
	public Adres(String straat, String huisnr, int postcode, String gemeente){
		this.straat = straat;
		this.huisnr = huisnr;
		gem = new Gemeente(postcode, gemeente);
		
	}

	public String getStraat() {
		return straat;
	}

	public String getHuisnr() {
		return huisnr;
	}

	public Gemeente getGemeente() {
		return gem;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}

	public String toString(){
		return getStraat() + " " + getHuisnr() + "\n" + gem;
	}
	
}