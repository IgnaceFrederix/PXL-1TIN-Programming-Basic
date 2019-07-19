package be.pxl.h10.voorbeeld;

public class SchoolApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();
		Student s1 = new Student();
		s1.setNaam("bill");
		s1.setVoornaam("tom");
		p1.setNaam("hillxy");
		p1.setVoornaam("edfd");
		
		System.out.println(p1.getVoornaam()+" "+p1.getVoornaam() +" en " + s1.getNaam()+" "+s1.getVoornaam());
		s1.setLeerkred(140);
		s1.setStudnr("64546");
		s1.setOpleid("inf");
		System.out.println(s1.getVoornaam()+" " + s1.getNaam());
		System.out.println(s1.getOpleid());
		System.out.println(s1.getLeerkred());
	
		s1.print();
		p1.print();
		Persoon p2 = new Student();
		p2.print();
		Lector l1 = new Lector();
		l1.setNaam("fdff");
		l1.setPersoneelsnr("5");
		l1.setSalaris(25);
		l1.setAantPerc(50);
		l1.print();
		
		Persoon [] lijst = {p1,s1,p2,l1};
		for(Persoon p: lijst){
			p.print();
			Student stud1 = new Student();
			Student stud2 = new Student();
			stud2.setNaam("Peeters");stud2.setVoornaam("jim");
			stud2.setStudnr("20000000");
			Lector lec1 = new Lector();
			Lector lec2 = new Lector("koeken","ann","2052454",100,200);
			stud1.print();
			stud2.print();
		lec1.print();
		lec2.print();
		System.out.println(Persoon.getAantal());
		System.out.println(Student.getAantal());
		System.out.println(Lector.getAantal());
		}
	}
 
}
