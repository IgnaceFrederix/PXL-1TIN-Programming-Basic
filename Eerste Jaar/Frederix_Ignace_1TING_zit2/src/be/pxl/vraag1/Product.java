package be.pxl.vraag1;
/*
 * Ignace Frederix
 * 1TIng
 */

import java.time.LocalDate;



public class Product implements Verkoopbaar, Vervalbaar {

	 private final static int AANTALINGREDIENTEN = 10;
	 Ingrediënt [] i = new Ingrediënt[AANTALINGREDIENTEN];
	 Werkuren w1;
	 private double ingkost;
	 private int aantal=0;
	 
	 public Product(Ingrediënt[] i,Werkuren w1 ){
		 
		 this.i = i;
		 this.w1 = w1;
		 
	 }
	 
	 public void VoegIngredientToe(String naam, double prijs, int dag, int maand, int jaar){
		 int j=0;
		 while(i[j]==null){
			 j++;
			 if(j >10){
				 break;
			 }
			 
			 
		 }
		 i[j]= new Ingrediënt(naam, prijs, dag, maand, jaar );
		 ingkost = ingkost+prijs;
		 aantal++;
	 }
	 
	 public double berekenPrijs(){
		 
		 return w1.getAantalUren()*w1.getPrijsPerUur() + ingkost;
	 }
	 
	 public String isVervalen(){
		 
		 for(int j =0; j<i.length;j++){
			 if(i[j].vervalDatum() ==false){
				return  "een van de producten is vervallen"; 
			 }
			 else{
				 return "";
						
			 }
		 }
		
	 }
	 
	 public String toString(){
		 StringBuilder test = new StringBuilder();
		
			for(int j =0;j<aantal;j++){
			test.append(i[j].getNaam()+", " + i[j].getPrijs()+" euro, "+ i[j].getL1() + "\n");
			
			
			}
			
			 return
					 w1.getPrijsPerUur()+ " euro per uur, "+ w1.getAantalUren()+" uren \n"+test;
	 }
	 
}
