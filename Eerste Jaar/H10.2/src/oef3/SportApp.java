package oef3;

public class SportApp {

	public static void main(String[] args) {
		Sporter[] sporters = new Sporter[7];
		
		sporters[0] = new Sporter("jossers", "jos", "vliegen");
		sporters[1] = new Sporter("janssen", "jan", "vliegen2");
		sporters[2] = new Sporter("Erikson", "Erik", "vliegen3");
		sporters[3] = new Voetballer("Dieters", "Dieter", "declub", "aanvaller");
		sporters[4] = new Voetballer("Dirker", "Dirk");
		sporters[5] = new Voetballer("Lessens", "Erika", "clubber", "test");
		sporters[6] = new Voetballer("Vliegen", "Els", "clubje", "middenvelder");
		
		for (Sporter sporter : sporters) {
			sporter.print();
		}
	}

}
