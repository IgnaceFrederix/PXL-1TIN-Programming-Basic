package opdracht6;

import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h =10;
		int b=-10;
		boolean ok = false;
		while(!ok){
			
		
		try{
		Rectangle rec = new Rectangle(b,h);
		ok = true;
		} catch(Exception ex){
			System.out.println("er is een negatieve hoogte of breedte ingegeven");
			System.out.println("geef een nieuwe hoogte in");
			h = in.nextInt();
			System.out.println("geef een neiuwe breedte in");
			b = in.nextInt();
		}
		}
		in.close();
	}

}
