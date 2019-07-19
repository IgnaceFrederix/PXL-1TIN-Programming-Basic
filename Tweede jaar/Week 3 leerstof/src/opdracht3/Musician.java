package opdracht3;

public class Musician {
	
	public Musician() {
		
	}
	
	public void play(){
		
		new Instrument(){

			@Override
			public void makeNoise() {
				System.out.println("Toeter toeter");
				
			}
			
		}.makeNoise();
	}
	
	

}
