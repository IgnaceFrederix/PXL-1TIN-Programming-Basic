package opdracht1;

public class Musician {
	
	public class Instrument{
		public String makeNoice(String noice){
		
			return noice;
		}
		
	}
	public void play(){
		 Instrument i = new Instrument();
		 System.out.println(i.makeNoice("bob"));
	}

}
