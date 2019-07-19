package be.pxl.vraag3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persoon {

	private String naam;
	private LocalDate geboortedatum;
	
	
	
	
	public Persoon(String naam, LocalDate geboortedatum){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate geboortejaar2 = LocalDate.parse(geboortedatum.toString(), format);
		this.naam = naam;
		this.geboortedatum = geboortejaar2;
		
	}
	
	public int aantalDagenTotVerjaardag(){
		LocalDate datum = LocalDate.of(geboortedatum.);
		LocalDate now = LocalDate.now();
		Period p = Period.
	}
	


	public String getNaam() {
		return naam;
	}
	
	
}


