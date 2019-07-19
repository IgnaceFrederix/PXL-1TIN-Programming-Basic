package voorbeelden;
import java.util.*;

public class Voorbeeld1 {

	


	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int sum;
	        System.out.println("geef ht eerste getal in");
	        a = input.nextInt();
	        System.out.println("geef een tweede getal in");
	        b = input.nextInt();
	        sum = a + b;
	        System.out.println("de som is" + sum);
	    }
	}
