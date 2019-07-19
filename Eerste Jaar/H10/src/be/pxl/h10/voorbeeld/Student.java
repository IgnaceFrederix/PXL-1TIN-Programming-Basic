package be.pxl.h10.voorbeeld;

public class Student extends Persoon {
	private int leerkred;
	private String studnr;
	private String opleid;
	private static int aantal;
	
	
	
	public Student(String nm, String vn, String nr, String opl){
		super(nm,vn);
		studnr = nr;
		opleid = opl;
		leerkred = 140;
		aantal++;
	}
	
	public Student(){
		this("onbekent","onbekent","15999999","xxx");
		}
	
	public Student(String nm, String vn){
		this(nm,vn,"1599999","xxx");
		
	}
	
	public Student(Student s){
		this(s.getNaam(),s.getVoornaam(),s.studnr, s.opleid);
		leerkred = s.leerkred;
	}
	
	public void setLeerkred(int lk){
		leerkred = leerkred +lk;
		if(leerkred < 0){
			leerkred =0;
		}else if(leerkred > 140){
			leerkred =140;
		}
	}
	
	
	public int getLeerkred(){
		return leerkred;
	}
	public String getStudnr() {
		return studnr;
	}
	public String getOpleid() {
		return opleid;
	}
	public void setStudnr(String studnr) {
		this.studnr = studnr;
	}
	public void setOpleid(String opleid) {
		this.opleid = opleid;
	}
	
	
	public void print(){
		super.print();
		System.out.println("studnenr" + studnr);
		System.out.println(opleid);
		System.out.println(leerkred);
	}
	
	public static int getAantal(){
		return aantal;
	}
	
	
	
	

}
