package be.pxl.vraag1;

import org.omg.Messaging.SyncScopeHelper;

/*
 * Ignace Frederix
 * 1Ting
 */
public class VerkoopbaarApp {

	public static void main(String[] args) {
		String [] alles = new String[3];
		Ingrediënt i = new Ingrediënt(null, 0, 0, 0, 0);
		Werkuren w = new Werkuren(0, 0);
		Product p = new Product(null, w);
		alles[0] = i.toString();
		alles[1] = w.toString();
		alles[3] = p.toString();
		
		System.out.println(alles[0]);
		System.out.println(alles[1]);
		System.out.println(alles[2]);
		if(i.IsVervallen()==true){
			System.out.println(i);
		}
		if(p.IsVervallen()==true){
			System.out.println(p);
		}
		

	}
	
	

}
