package be.pxl.h10.oef2;

public class GeboekteReis {
	private String naam;
	private Reis[] reizen;
	
	public GeboekteReis(String naam, int aantalReizen) {
		setNaam(naam);
		reizen = new Reis[aantalReizen];
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void voegReisToe(Reis reisToeTeVoegen) { 
		Boolean toevoegenMogelijk = false;
		int teller = 0;
		for (Reis reis : reizen) {
			if (reis == null) {
				toevoegenMogelijk = true;
				break;
			}
			teller++;
		}
		
		if (toevoegenMogelijk) {
			reizen[teller] = reisToeTeVoegen;
		}
	}
	
	public void print() {
		System.out.println("Reis van " + this.naam);
		
		for (Reis reis : reizen) {
			System.out.print("==>");
			reis.print();
		}
	}
}
