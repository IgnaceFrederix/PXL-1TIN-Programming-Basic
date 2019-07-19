package opdracht1;

public class KlasApp {

	public static void main(String[] args) {
		System.out.println("het max studetenten "+ Klas.max);
		Klas ting = new Klas("1TING", 35);
		Klas tinh = new Klas("1TINH",39);
		Klas tinb = new Klas("1TINB",36);
		
		System.out.println(Klas.getCount());
		System.out.println(Klas.getTotStud());
		Klas[] lijst = new Klas[3];
		lijst[0]=ting;
		lijst[1]=tinh;
		lijst[2]=tinb;
		for(Klas k : lijst){
			System.out.println(k.getNaam()+ " " + k.getAant());
		}
		tinb.setAant(tinb.getAant()+1);
		for(Klas k : lijst){
			System.out.println(k.getNaam()+ " " + k.getAant());
		}
		
	}

}