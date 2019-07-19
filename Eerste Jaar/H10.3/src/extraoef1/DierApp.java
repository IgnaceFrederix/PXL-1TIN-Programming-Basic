package extraoef1;

public class DierApp {

	public static void main(String[] args) {
		Dier d1 = new Dier("olifant", "herbivoor");
		Hond h1 = new Hond("Lassie");
		Hond h2 = new Hond("Bessie","Terrier",2010);
		Rund r1 = new Rund(true,2013);
		
		System.out.println("d1 :" + d1.toString());
		System.out.println("d1: " + h1.toString());
		System.out.println("d1:" + h2.toString() );
		System.out.println("r1:  "+ r1.toString());

	}

}
