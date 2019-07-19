package extraoef1;

public class Rund extends Dier {
	
	boolean melkkoe;
	
	public Rund(){
		super("rund","herbivoor");
	}
	
	public Rund(boolean melkkoe, int geboorteJaar){
		super("rund","herbivoor",geboorteJaar);
		this.melkkoe = melkkoe;
	}
	
	@Override
	public String toString(){
		if(melkkoe ==true){
			return super.toString() + "het is een melkkoe  ";
		}else{
			return super.toString() + "het is geen melkkoe  ";
		}
		
		
	} 
	
	

}
