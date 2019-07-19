package be.pxl.h11.voorbeeld;

public enum Dag {
	MAANDAG(true),DINSDAG(true),WOENSDG(true),DONDERDAG(true),VRIJDAG(true),ZATERDAG(false),ZONDAG(false);
	
	private boolean weekdag;
	
	private Dag(boolean weekdag){
		this.weekdag = weekdag;
	}
	
	public boolean getWeekdag(){
		return weekdag;
	}
	

}
