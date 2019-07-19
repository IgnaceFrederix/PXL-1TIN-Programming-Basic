package be.pxl.vraag1;
//Ignace frederix
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Customer extends Person {
	
	
	private String customerId;
	private static int numerofCustomersToday;
	
	{
		numerofCustomersToday++;
	}

	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
		
	}
	
	//public Discount getDiscount(){
		
		//return 
	//}
	
	public void setDiscount(Discount discount){
		//Discount.discount;
		
	}
	
	public static int getNumberOfCustomersToday(){
		return numerofCustomersToday;
	}
	
	public String getCustomerId(){
		//localdate staat blijkbaar al in juiste parsedatum
		//als dit zou moeten gepasred worden wat volgens mij niet nodig is staat de lijn code hier onder begreep de vraagstelling niet compleet
		//DateTimeFormatter formatterJuiost = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate vandaag=LocalDate.now();
		StringBuilder genereer = new StringBuilder();
		genereer.append(vandaag).append("-").append(numerofCustomersToday);
		
		customerId = genereer.toString();
		return customerId;
		
	}
	
	
	public void print() {
		System.out.println("Klant:" + customerId);
		System.out.println(super.getFirstName() +" "+ super.getLastName());
		//System.out.println(getDiscount().print());

	}

}
