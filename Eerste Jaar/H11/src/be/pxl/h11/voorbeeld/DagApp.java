package be.pxl.h11.voorbeeld;

public class DagApp {

	public static void main(String[] args) {
		for(Dag d : Dag.values()){
			System.out.println(d);
			System.out.println(d.ordinal());
			System.out.println(d.toString().toLowerCase());
			if(d.getWeekdag())
				System.out.println("weekdag");
			else System.out.println("weekend");
		}

	}

}
