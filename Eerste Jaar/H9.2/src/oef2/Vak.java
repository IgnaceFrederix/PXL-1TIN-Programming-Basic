package oef2;

public class Vak {
	private String code, naam;
	private int aantalSTP;

	public Vak(String code, String naam, int aantalSTP) {
		setCode(code);
		setNaam(naam);
		setAantalSTP(aantalSTP);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		if (!code.substring(1, 2).equals("1") && !code.substring(1, 2).equals("2")
				&& !code.substring(1, 2).equals("3")) {
			code = code.replaceFirst(code.substring(1, 2), "1");
		}
		this.code = code;
	}

	public String getJaar() {
		return this.code.substring(1, 2);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalSTP() {
		return aantalSTP;
	}

	public void setAantalSTP(int aantalSTP) {
		if (aantalSTP > 18) {
			aantalSTP = 18;
		}
		if (aantalSTP % 3 == 2) {
			aantalSTP += 1;
		} else {
			aantalSTP += 2;
		}
		this.aantalSTP = aantalSTP;
	}

}
