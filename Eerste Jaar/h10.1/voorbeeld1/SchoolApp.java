package be.pxl.h10.voorbeeld1;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoon pers = new Persoon("Niels", "Machiels");
		Student stud = new Student("Tycho", "Broux");
		System.out.println(stud.getNaam() + " " + stud.getVoornaam());
		System.out.println(pers.getNaam() + " " + pers.getVoornaam());
		stud.setLeerkrediet(100);
		stud.setOpleiding("Toegepaste Informatica");
		stud.setStudentNr(11500479);
		stud.print();
		pers = stud;
		System.out.println(pers.getNaam() + " " + pers.getVoornaam());
		pers.print();
		
	}

}
