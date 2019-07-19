package be.pxl.vraag1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Ignace Frederix
 * 1TING
 */
public class Ingrediënt implements Verkoopbaar, Vervalbaar {
		
	private String naam;
	private double prijs;
	private LocalDate l1;
	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Ingrediënt(String naam, double prijs, int dag, int maand, int jaar){
		this.naam = naam;
		this.prijs = prijs;
		l1 = LocalDate.of(jaar,maand,dag);
	}
	
	
	


	public double berekenPrijs(){
		return prijs;
	}
	
	public boolean vervalDatum(){
		if(l1.now().isAfter(l1)){
			return false;
		}
			else{
				return true;
			}
		}
	
	  public String getNaam() {
		return naam;
	}





	public double getPrijs() {
		return prijs;
	}





	public LocalDate getL1() {
		l1.parse(format2)
		return l1;
	}





	@Override
	public String toString(){
		return naam+", "+prijs+" euro,"+l1.getDayOfMonth()+"-"+l1.getMonthValue()+"-"+l1.getYear();
	}
	
	}
	
	
	
	

