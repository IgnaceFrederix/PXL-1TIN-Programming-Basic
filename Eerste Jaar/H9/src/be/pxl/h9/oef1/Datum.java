package be.pxl.h9.oef1;

public class Datum {
	
	
	private int dag;
	private  int maand;
	private int jaar;
	private String[] maandNamen = {"januarie","febuarie","maart","april","mei","juni","juli","augustus","september","oktober","novmeber","december"};

	
	
	public Datum(){
		this(1,1,2016);
	}
	
	
	
	public Datum(int dag,int maand, int jaar){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		
	}


	public int getDag() {
		
		return dag;
	}


	public void setDag(int dag) {
		this.dag = dag;
	}


	public int getMaand() {
		
		if(maand < 1){
			System.out.println(this.maand);
			System.out.println("geef opnieuw een maand in");
		}
		if(maand > 12){
			System.out.println("geef opnieuw een maand in");
		}
			
		this.maand = maand;
		return maand;
	}
	


	public void setMaand(int maand) {
		this.maand = maand;
	}


	public int getJaar() {
		return jaar;
	}


	public void setJaar(int jaar) {
		this.jaar = jaar;
	}


	public String[] getMaandNamen() {
		return maandNamen;
	}


	public void setMaandNamen(String[] maandNamen) {
		this.maandNamen = maandNamen;
	}
	
	public void print(){
		System.out.println(getDag()+" "+ getMaandNamen()[getMaand()-1] +" "+ getJaar());
	}
	public void drukKalender(){
		System.out.println("****Kalender voor "+getMaandNamen()[getMaand()-1]+" "+getJaar()+"****" );
		for(int i =0; i < 10; i++)
		{
			System.out.println(getDag()+" "+getMaandNamen()[getMaand()-1]+" "+getJaar() +"\t");
		}
	
	
	}
}


