package be.pxl.h13.oef1;

public abstract class Acteur extends WereldObject {
	
	public Acteur(int x, int y){
		super(x,y);
	}
	
	public abstract void integrageer();
	
	public void stapBoven(){
		setY(getY()+1);
	}
	public void stapLinks(){
		setX(getX()-1);
	}
	public void stapOnder(){
		setY(getY()+1);
	}
	public void setRechts(){
		setY(getY()+1);
	}
	
	
		
	

}
