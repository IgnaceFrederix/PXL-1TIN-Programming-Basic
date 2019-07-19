package be.pxl.h13.oef1;

public abstract class WereldObject {
	Punt positie;
	
	public WereldObject(int x, int y){
		positie = new Punt(x,y);
		
	}
	
	public int getX(){
		return positie.getX();
	}
	
	public int getY(){
		return positie.getY();
	}
	
	public void setX(int x){
		positie.setX(x);
	}
	
	public void setY(int y){
		positie.setY(y);
	}
	public double berekenAfstand(WereldObject w){
		return this.positie.berekenAfstand(w.positie);
	}
	
	
	public abstract void beschrijf();
	
	
	

}
