package be.pxl.vraag1;

public final class Landmijn {
	
	private int schade;
	private boolean actief;
	private final static int MINSCHADE = 10;
	private final static int MAXSCHADE = 100;
	
	public Landmijn(int schade){
		this.schade = schade;
		if(schade < MINSCHADE){
			schade = MINSCHADE;
		}
		if(schade > MAXSCHADE){
			schade = MAXSCHADE;
		}
	}

	public int getSchade() {
		return schade;
	}

	public boolean isActief() {
		return actief;
	}

	public static int getMinschade() {
		return MINSCHADE;
	}

	public static int getMaxschade() {
		return MAXSCHADE;
	}

	public void setSchade(int schade) {
		if(schade < MINSCHADE){
			schade = MINSCHADE;
		}
		if(schade > MAXSCHADE){
			schade = MAXSCHADE;
		}
		this.schade = schade;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}
	
	public void Ontplof(){
		actief = false;
	}
	
	
	@Override
	public String toString(){
		if(actief = false){
			return "Ontplofte landmijn";
			
		}else{
			return "Actieve landmijn 20 schade";
		}
	}
	
	

}
