package be.pxl.vraag3;

public class Persoon {
	
	private Wapen wapen;
	private Schild schild;
	private int levenspunten;
	
	public Persoon(Wapen wapen, Schild schild, int levenspunten ){
		this.wapen = wapen;
		this.schild = schild;
		this.levenspunten = levenspunten;
	}

	public int getLevenspunten() {
		return levenspunten;
	}

	public void setLevenspunten(int levenspunten) {
		this.levenspunten = levenspunten;
	}

	public void valAan(Persoon p2){
		int dmg=0;
		int dmgele=0;
		if(this.wapen.getAanvalswaarde()<  p2.schild.getVerdedigingswaarde()){
			dmg =0;
		}
			else{
				dmg =this.wapen.getAanvalswaarde()- p2.schild.getVerdedigingswaarde();
		}
		if(this.wapen.getAanvalswaardeElement() ==p2.schild.getVerdedigingswaardElement()){
			if(this.wapen.getAanvalswaardeElement() < p2.schild.getVerdedigingswaardElement())
			{
				dmgele = 0;
			}else{
				dmgele = this.wapen.getAanvalswaardeElement()-p2.schild.getVerdedigingswaardElement();
			}
			
		}
		p2.setLevenspunten(levenspunten-dmg);
		p2.setLevenspunten(levenspunten-dmgele);
		
		}
	
				
}
	
	

