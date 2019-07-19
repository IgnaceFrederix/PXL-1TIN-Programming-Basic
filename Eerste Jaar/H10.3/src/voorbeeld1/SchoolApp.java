package voorbeeld1;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persoon pers = new Persoon();
		Student stud = new Student();
		
		stud.setNaam("jefferson");
		stud.setVoornaam("obama");
		
		stud.setLeerkrediet(80);
		stud.setSttudentNummer("2001684");
		stud.setOpleiding("it");
		stud.setNaam("grrgr");
		stud.setVoornaam("fdf");
		stud.print();
		pers.setNaam("edede");
		pers.setVoornaam("pauze");
		pers.print();
		
		Persoon pol = new Student();
		pol.setNaam("trump");
		pol.setVoornaam("donald");
		
		Lector lec = new Lector();
			lec.setNaam("dffdf");
			lec.setVoornaam("dfsfd");
			lec.setAantstellingsPercentage(150);
			lec.setSalaris(25155);
			lec.setSalaris(2500);
			lec.setPersooneelsNummer("5454554");
			lec.print();
			lec.setAantstellingsPercentage(50);
			System.out.println(lec.getAantstellingsPercentage() + lec.getSalaris());
			
			
			
			
	Persoon[] persArray = {pers,stud,pol,lec};
	
	for(Persoon p : persArray){
		p.print();
	
	}
	
	Student stud1 = new Student("elf","super","1005525","it");
	Student stud2 = new Student("elf","twaalf");
	Lector lect1 = new Lector("fdgf","df","54654", 2,150);
	Lector lect2 = new Lector();
	
	Persoon[] persArray2 = {stud1,stud2,lect1,lect2};
	for(Persoon p : persArray2){
		p.print();
		
	}
	
	System.out.println("aantal aangemaakte personen "  + Persoon.getAantal() );
	System.out.println(Student.getAantal());
	System.out.println(Lector.getAantal());
	
			
			
		
		
		

	}
	

}
