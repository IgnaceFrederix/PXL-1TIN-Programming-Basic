package be.px.h82.oef1;

public class auto {
	
	private	String merk;
	private String model;
	private int bouwjaar;
	private int maxspeed;
	private	String kleur;
	private  final int MAX;
	private static int count = 0;
	private static int count2 = 0;
	
	
	{
		MAX=180;
	}
	public auto (){
		this("VW","polo",2015,"grijs",160);
	}
	public auto (String merk, String model, int bouwjaar, String kleur, int maxspeed){//default constructor
		this.merk = merk;
		this.model = model;
		this.bouwjaar = bouwjaar;
		this.kleur = kleur;
		this.maxspeed = maxspeed;
		setMaxspeed(maxspeed);
		
	}
	public auto(auto a){
		this(a.merk, a.model, a.bouwjaar,a.kleur,a.maxspeed);
	}
	{
		count++;
	}
	
	
	
	
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBouwjaar() {
		return bouwjaar;
	}
	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}
	public String getKleur() {
		return kleur;
	}
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public  int getMax() {
		return MAX;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
		if(maxspeed >= MAX)
		{
			this.maxspeed = MAX;
			count2++;
		}
	
	}
	
	public void print(){
		System.out.println(getMerk() + getModel()+ getBouwjaar()+ getKleur()+ getMaxspeed());
	}
	public static int getCount(){
		return count;
	}
	public static int getPerc(){
		return count2;
	}
	
	

}
