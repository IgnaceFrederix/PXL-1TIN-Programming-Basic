package be.pxl.h10.voorbeeld;

public class Lector extends Persoon {
	
	private String personeelsnr;
	private int aantPerc;
	private double salaris;
	private static int aantal;
	
	
	public Lector(String nm, String vn, String nr, int aantPerc, int sal){
		super(nm,vn);
		personeelsnr = nr;
		this.aantPerc = aantPerc;
		salaris = sal;
		aantal++;
	}
	public Lector(String nm, String vn, int aantPerc, int sal){
		this(nm,vn,"200099",aantPerc,sal);
	}
	
	public Lector(){
		this("onbekend","onbekend","200099",100,2000);
	}
	
	
	public String getPersoneelsnr() {
		return personeelsnr;
	}
	public int getAantPerc() {
		return aantPerc;
	}
	public double getSalaris() {
		return salaris;
	}
	public void setPersoneelsnr(String personeelsnr) {
		this.personeelsnr = personeelsnr;
	}
	public void setAantPerc(int aantPerc) {
		int oud = this.aantPerc;
		if(aantPerc <0){
			aantPerc =0;
		}else if(aantPerc > 100){
			aantPerc = 100;
			
		}
		this.aantPerc = aantPerc;
		if(oud != 0 && salaris != 0){
			salaris = (double)this.aantPerc/oud*salaris;
		}
	}
	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}
	@Override
	public void print(){
		super.print();
		System.out.println("Lectit emet perosneelnumer " + personeelsnr);
		System.out.println("aantalpercentage " + aantPerc + "%");
		System.out.println("Salaris " + salaris);
	}
	
	public static int getAantal(){
		return aantal;
	}
	
	

}
