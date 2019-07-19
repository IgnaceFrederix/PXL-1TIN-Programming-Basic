package be.pxl.h9.oef1;

public class Huwelijk {
	int dag,maand,jaar;
	Datum d1 = new Datum();
	Persoon p1 = new Persoon();
	Persoon p2 = new Persoon();
	
	public Huwelijk(String naamman, String naamvrouw, int dag, int maand, int jaar){
		p1.setVoornaam(naamman);
		p2.setVoornaam(naamvrouw);
		this.d1.setDag(dag);
		this.d1.setMaand(maand);
		this.d1.setJaar(jaar);
		
		System.out.println(p1.getVoornaam() + " "+ p1.getNaam() + " en "+ p2.getVoornaam() + " " +p2.getNaam() + " gehuwd op  "+ d1.getDag() + " "+ d1.getMaand()+" "+ d1.getJaar()+" Proficiat!");
		
	}
	
	
	

	public void adresWijzigen(){
		p2.setGemeente(p1.getGemeente());
		p2.setHuisnr(p1.getHuisnr());
		p2.setPostcode(p1.getPostcode());
		p2.setStraat(p1.getStraat());
		
	}
	public void print(){
		System.out.println(p1.getVoornaam()+ " "+ p1.getNaam());
		System.out.println(p1.getStraat()+" "+ p1.getHuisnr());
		System.out.println(p1.getPostcode()+" "+p1.getGemeente());
		System.out.println("geboren op "+ p1.getDag()+ " "+p1.getMaand()+p1.getJaar());
		System.out.println();
		
		System.out.println(p2.getVoornaam()+ " "+ p2.getNaam());
		System.out.println(p2.getStraat()+" "+ p2.getHuisnr());
		System.out.println(p2.getPostcode()+" "+p2.getGemeente());
		System.out.println("geboren op "+ p2.getDag()+ " "+p2.getMaand()+p2.getJaar());
		System.out.println();
	
		System.out.println("het huwelijk vond plaats op " + d1.getDag()+" "+d1.getMaand()+" "+d1.getJaar());
		
	}

}
