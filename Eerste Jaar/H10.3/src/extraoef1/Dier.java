package extraoef1;

import java.util.Scanner;

public class Dier {
	
	private String soort;
	private String voedselType;
	private int geboorteJaar;
	
	
	
	public Dier( String soort, String voedselType){
		this.soort = soort;
		this.voedselType = voedselType;
	}
	public Dier(String soort, String voedselType, int geboorteJaar){
		this.soort = soort;
		this.voedselType = voedselType;
		this.geboorteJaar = geboorteJaar;
	}
	
	public String toString(){
		return soort+"";
		
	}
	
	public int geefGeboorteJaar(){
		Scanner input = new Scanner(System.in);
		System.out.println("geef een geboortejaar in");
		geboorteJaar = input.nextInt();
		return geboorteJaar;
	}
	


}
