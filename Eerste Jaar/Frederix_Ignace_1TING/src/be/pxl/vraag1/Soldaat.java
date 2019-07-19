package be.pxl.vraag1;



public final class Soldaat extends Karakter {
	
	private int aanvalspunten;
	Soldaat s1;
	Soldaat s2;
	
	public Soldaat(int levenspunten, Land land, int aanvalspunten) {
		super(levenspunten, land);
		this.aanvalspunten = aanvalspunten;
		if(aanvalspunten <0){
			aanvalspunten = 0;
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object interageer(Soldaat s1, Soldaat s2) {
		// TODO Auto-generated method stub
		if(s1 instanceof s2 ){
			if(Soldaat.isLevend(true)){
				if(!s1.getLand().equals(s2.getLand())){
					s1.setLevenspunten(s1.getLevenspunten()-s2.aanvalspunten);
					s2.setLevenspunten(s2.getLevenspunten()-s1.aanvalspunten);
					
				}
				
			}
		}
		if(s1 instanceof Landmijn l1){
			if(Soldaat.isLevend(true){
				if(Landmijn.isActief() = true){
					s1.setLevenspunten(getLevenspunten()-l1.getSchade());
					l1.setActief(false);
				}
			}
		}
		return null;
	}

	@Override
	public String toString(){
		if(Soldaat.isLevend(true)){
			return "Soldaat levend" + s1.getLand() + s1.getLevenspunten() + " levenspunten "+ s1.aanvalspunten + " aanvalspunten";
		}
		else{
			return "Dode soldaat " +s1.getLand();
		}
	}
	
	
	
	

}
