package voorbeeld1;

public class Student extends Persoon {
	
	private int leerkrediet;
	private String sttudentNummer;
	private String opleiding;
	private static int aantal=0;
	
	
	
	public Student(){
		//super("onbekend","onbekend");
		
		this("onbekend", "onbekend","15999999","xxx");
	}
	
	public Student(String naam, String voornaam){
		//super(naam, voornaam);
		this(naam, voornaam,"15999999","xxx");
	}
	public Student(String naam, String voornaam, String sttudentNummer, String opleiding){
		super(naam, voornaam);
		this.sttudentNummer = sttudentNummer;
		this.opleiding = opleiding;
		leerkrediet =140;
		aantal++;
	}
	
	public Student(Student stud){
		this(stud.getNaam(), stud.getVoornaam(), stud.sttudentNummer, stud.opleiding);
	}

	
	public void setLeerkrediet(int lk){
		leerkrediet += lk;
		if(leerkrediet < 0){
			leerkrediet = 0;
		}else if (leerkrediet > 140){
			leerkrediet = 140;
		}
	}
	
	public int getLeerkrediet(){
		return leerkrediet;
	}


	public String getSttudentNummer() {
		return sttudentNummer;
	}


	public String getOpleiding() {
		return opleiding;
	}


	public void setSttudentNummer(String sttudentNummer) {
		this.sttudentNummer = sttudentNummer;
	}


	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}
	
	@Override
	public void print(){
		
		super.print();
		System.out.println(sttudentNummer +  leerkrediet + opleiding);
	}
	public static int getAantal(){
		return aantal;
	}
}
