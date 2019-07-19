package oef1;


public class HuwelijkApp {

	public static void main(String[] args) {
		Gemeente gem = new Gemeente();
		Adres adr = new Adres();
		System.out.println(gem.toString());
		System.out.println(adr.getGemeente().getGemNaam());
		adr.getGemeente().setGemNaam("test");
		System.out.println(adr.getGemeente().getGemNaam());
		Persoon pers = new Persoon();
		Persoon pers2 = new Persoon("Kenissen", "Ann", 29, 11, 1990, "Alfonsjeurissenstraat", "35", 3590, "Diepenbeek");
		System.out.println(pers.toString() + "\n" + pers2.toString());
		
		//wijzigen gemeentenaam pers1
		pers.getAdr().getGemeente().setGemNaam("Diest");
		
		//wijzigen geboortedatum pers1
		pers2.getGeboorteDatum().setDag(30);
		pers2.getGeboorteDatum().setMaand(6);
		pers2.getGeboorteDatum().setJaar(1989);
		
		//afdrukken personen
		System.out.println(pers.toString() + "\n" + pers2.toString());
		System.out.println();
		
		Huwelijk huwelijk = new Huwelijk(pers, pers2, 25, 6, 2015);
		
		//afdrukken gegeven partner 1
		System.out.println(huwelijk.getPartner1().toString() + "\n");
		
		huwelijk.adresWijziging("test", "test", 3580, "test");
		
		huwelijk.print();
	}

}
