package be.pxl.h9.oef2;

public class Vak {
	private String code;
	private String naam;
	private int aantalSTP;
	private int test;
	
	public Vak(String code,String naam, int aantalSTP){
		this.code = code;
		this.naam = naam;
		this.aantalSTP = aantalSTP;
		
	}

	public String getCode() {
		test = code.charAt(1);
		if(test > 4 )  
		{
			test = 1;
		//	code.charAt(1) = (String)test;
		}
		return code;
	}

	public String getNaam() {
		return naam;
	}

	public int getAantalSTP() {
		if(aantalSTP > 18 )
		{
			aantalSTP =18;
		}
		if(aantalSTP  %3 != 0){
			aantalSTP = (aantalSTP/3)*3; 
		}
		return aantalSTP;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setAantalSTP(int aantalSTP) {
		this.aantalSTP = aantalSTP;
	}
	
	
	}


