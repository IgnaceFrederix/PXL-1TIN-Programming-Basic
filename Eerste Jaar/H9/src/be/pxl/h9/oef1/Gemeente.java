package be.pxl.h9.oef1;

public class Gemeente {
	
	private int postcode;
	private String gemNaam;
	
	
	
	public Gemeente(int postcode, String gemNaam){
		this.postcode = postcode;
		this.gemNaam = gemNaam;
		
	}


	public int getPostcode() {
		
		
		return postcode;
	}


	public String getGemNaam() {
		 String deel1;
		 String deel2;
		 StringBuilder s1 = new StringBuilder();
		deel1 = gemNaam.substring(0,1).toUpperCase();
		
		deel2 = gemNaam.substring(1, gemNaam.length()).toLowerCase();
		for(int i =0; i < gemNaam.length(); i++)
		{
			
		}
		s1 = s1.append(deel1).append(deel2);
		//if(s1.indexOf(deel2, 20) = 5)
		{
		
		}
		return s1.toString();
	}


	public void setPostcode(int postcode) {
		while(postcode > 10000)
		{		
			postcode =postcode/10;
			
		}
		while(postcode < 1000)
		{
			postcode = postcode*10;
		
			
		}
		this.postcode = postcode;
	}


	public void setGemNaam(String gemNaam) {
		this.gemNaam = gemNaam;
	}
	
	public String toString(){
		return getPostcode() + " " + getGemNaam();
	}
	
	
	

}
