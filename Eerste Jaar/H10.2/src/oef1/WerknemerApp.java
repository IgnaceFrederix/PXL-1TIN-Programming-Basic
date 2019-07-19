package oef1;

public class WerknemerApp {

	public static void main(String[] args) {
		Werknemer werk1 = new Werknemer("Janssen", "Jan");
		Werknemer werk2 = new Werknemer("Aerts", "Danny", 980, "Arbeider");
		Manager mngr1 = new Manager("De Baas", "John", 1000, "Manager");

		werk1.print();
		System.out.println();
		werk2.print();
		System.out.println();
		mngr1.print();

		System.out.println();
		System.out.println("Aantal Werknemers: " + Werknemer.getAantalWerknemers());
		System.out.println("Aantal Managers: " + Manager.getAantalManagers());
		System.out.println("Percentage Managers: " + Manager.getProcAandeelManagers());
	}

}
