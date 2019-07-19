package be.pxl.h10.oef2;

public class ReisApp {

	public static void main(String[] args) {
		TreinReis test = new TreinReis("8888Brussel", 5.0, true, "KKK");
		test.print();
		VliegtuigReis test1 = new VliegtuigReis("Hasselt");
		VliegtuigReis test2 = new VliegtuigReis("Diepenbeek", 18.00, "f568");
		
		test1.print();
		test2.print();
		
		GeboekteReis testen = new GeboekteReis("Niels Machiels", 2);
		
		testen.voegReisToe(test);
		testen.voegReisToe(test1);
		testen.voegReisToe(test2);

		testen.print();
	}

}
