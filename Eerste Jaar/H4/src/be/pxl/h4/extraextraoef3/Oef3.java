package be.pxl.h4.extraextraoef3;
import java.util.Scanner;

public class Oef3 {
	
	  private static Scanner input = new Scanner(System.in);
	  public static void main(String[] args) {
	 int waterverbruik;
	 double extra;
	 double verbruik;
	System.out.println("test");
	  System.out.println("geef uw waterverbruik in");
	  waterverbruik = input.nextInt();
	  if(waterverbruik > 5000)
	  {
		  extra = (waterverbruik - 30);
		  verbruik = (extra * 1.2) + 25;
		  System.out.println("te betalen bedrag is" + verbruik);
	  }
	  else{
		  if(waterverbruik > 200 )
		  {
			  extra = (waterverbruik - 30);
			  verbruik = (extra * 1.1) + 25;
			  System.out.println("te betalen bedrag is" + verbruik);
		  }
			  else {
				  extra = (waterverbruik - 30);
				  verbruik = (extra * 1) + 25;
				  System.out.println("te betalen bedrag is" + verbruik); 
			  }
			  
		  }
		  
	   
	  }
	  
	  }
	  
	



