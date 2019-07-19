package voorbeeld1;

public class Persoon {
	
	private String naam;
	private String voornaam;
	private static int aantal;
	
	

	{
		aantal++;
	}

		public Persoon(){
			
		}
		
		public Persoon(String naam, String voornaam){
			this.naam = naam;
			this.voornaam = naam;
		}

		public String getNaam() {
			return naam;
		}

		public String getVoornaam() {
			return voornaam;
		}

		public void setNaam(String naam) {
			this.naam = naam;
		}

		public void setVoornaam(String voornaam) {
			this.voornaam = voornaam;
		}
		
		static public int getAantal(){
			return aantal;
		}
		
		public void print(){
					System.out.println("naam " + naam + " voornaam" + voornaam);
		}
		
		
		
		
}