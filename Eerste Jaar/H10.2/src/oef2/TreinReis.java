package oef2;

public class TreinReis extends Reis {
	private String[] specificaties = { "IC", "IR", "P" };
	private Boolean nationaal;
	private String specificatie;
	
	public TreinReis(String bestemming) {
		this(bestemming, getMinPrijs(), true, "IC");
	}
	
	public TreinReis(String bestemming, double prijs, Boolean nationaal, String specificatie) {
		super(bestemming, prijs);
		setNationaal(nationaal);
		setSpecificatie(specificatie);
	}

	public Boolean getNationaal() {
		return nationaal;
	}

	public void setNationaal(Boolean nationaal) {
		this.nationaal = nationaal;
	}

	public String getSpecificatie() {
		return specificatie;
	}

	public void setSpecificatie(String specificatie) {
		if (this.nationaal) {
			Boolean isSpecificatieNationaal = false;
			for (String spec : specificaties) {
				if (specificatie.equals(spec)) {
					isSpecificatieNationaal = true;
				}
			}
			if (isSpecificatieNationaal) {
				this.specificatie = specificatie;
			} else {
				this.specificatie = "IC";
			}
		} else {
			this.specificatie = specificatie;
		}
		
	}
	
	@Override
	public void print() {
		super.print();
		if (this.nationaal) {
			System.out.printf("Nationale treinreis (%s)\n", this.specificatie);
		} else {
			System.out.printf("Treinreis (%s)\n", this.specificatie);
		}
	}
}
