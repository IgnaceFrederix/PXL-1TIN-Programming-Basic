package be.pxl.h5.oef1;
import java.util.*;
public class Oef1 {
	  private static Scanner input = new Scanner(System.in);
	  
	  public static void main(String[] args) {
		  double invoerbedrag;
		  double totaalbedrag;
		  System.out.println("geef een bedrag in BEF weer om het om te zetten");
		  invoerbedrag = input.nextInt();
		  totaalbedrag = (invoerbedrag/40.3399);
		  System.out.println("uw bedrag in Euro is " + totaalbedrag );
		  input.close();
	  }
	
}
