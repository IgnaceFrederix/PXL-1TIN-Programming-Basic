package be.pxl.h10.voorbeeld1;

public class Student extends Persoon {
	private int leerkrediet = 0;
	private String opleiding;
	private int studentNr;
	
	public Student() {
		super ("test", "student");
	}
	
	public Student(String naam, String voornaam) {
		super(naam, voornaam);
	}
	
	public Student(String naam, String voornaam, String opleiding, int studentNr, int leerkrediet) {
		this(naam, voornaam);
		setOpleiding(opleiding);
		setStudentNr(studentNr);
		setLeerkrediet(leerkrediet);
	}
	
	public Student(Student stud) {
		this(stud.getNaam(), stud.getVoornaam(), stud.getOpleiding(), stud.getStudentNr(), stud.getLeerkrediet());
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.leerkrediet);
		System.out.println(this.opleiding);
		System.out.println(this.studentNr);
	}
	
	public String getOpleiding() {
		return opleiding;
	}
	
	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}
	
	public int getStudentNr() {
		return studentNr;
	}
	
	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}
	
	public int getLeerkrediet() {
		return leerkrediet;
	}
	
	public void setLeerkrediet(int leerkrediet) {
		if (this.leerkrediet + leerkrediet > 0 && this.leerkrediet + leerkrediet <= 140) {
			this.leerkrediet += leerkrediet;
		} 
	}
}
