package be.pxl.vraag1;

public abstract class Karakter extends WereldObject  implements Intergerend{
	
	private static int levenspunten;
	private static Land land;
	private final static int MAXLEVENSPUNT = 100;
	
	public Karakter(int levenspunten, Land land){
		this.levenspunten = levenspunten;
		this.land = land;
		if(levenspunten < 0){
			levenspunten = 0;
		}
		if(levenspunten > MAXLEVENSPUNT){
			levenspunten = MAXLEVENSPUNT;
		}
	}

	public int getLevenspunten() {
		return levenspunten;
	}

	public static Land getLand() {
		return land;
	}

	public void setLevenspunten(int levenspunten) {
		if(levenspunten < 0){
			levenspunten = 0;
		}
		if(levenspunten > MAXLEVENSPUNT){
			levenspunten = MAXLEVENSPUNT;
		}
		this.levenspunten = levenspunten;
	}
	
	public static boolean isLevend( boolean leef){
		if(levenspunten >0){
			return true;
		}else{
			return false;
		}
	}

	public Object interageer(Soldaat s1, Soldaat s2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
