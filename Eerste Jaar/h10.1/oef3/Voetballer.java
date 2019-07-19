package be.pxl.h10.oef3;

public final class Voetballer extends Sporter {
	private String club, opstelling;
	private String[] opstellingen = {"middenvelder", "aanvaller", "verdediger", "onbepaald" };
	
	public Voetballer(String naam, String voornaam) {
		this(naam, voornaam, "onbepaald", "onbepaald");
	}
	
	public Voetballer(String naam, String voornaam, String club, String opstelling) {
		super(naam, voornaam, "voetballer");
		setClub(club);
		setOpstelling(opstelling);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getOpstelling() {
		return opstelling;
	}

	public void setOpstelling(String opstelling) {
		Boolean juisteOpstelling = false;
		for (String positie : opstellingen) {
			if (positie.equalsIgnoreCase(opstelling)) {
				juisteOpstelling = true;
			}
		}
		
		if (juisteOpstelling) {
			this.opstelling = opstelling;
		} else {
			this.opstelling = "onbepaald";
		}
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("club: %s opstelling: %s\n", this.club, this.opstelling);
	}
}
