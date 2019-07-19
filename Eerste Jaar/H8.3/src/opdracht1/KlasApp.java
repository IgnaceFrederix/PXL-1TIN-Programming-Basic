package opdracht1;

public class KlasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Klas.max);
		Klas tinc = new Klas("1TINC", 30);
		System.out.println(tinc.getNaam() +"" + tinc.getAantal() + tinc.count);
		Klas tind = new Klas("1TIND",33);
		System.out.println(tind.getNaam() +"" + tind.getAantal() + tind.count);

		Klas[]klasArray = {tinc,tind};
		for(Klas k : klasArray){
			System.out.println(k.getNaam() +" " + k.getAantal());
		}
	}

}
