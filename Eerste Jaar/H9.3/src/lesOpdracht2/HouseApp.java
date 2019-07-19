package lesOpdracht2;

public class HouseApp {

	public static void main(String[] args) {
		House huis = new House();
		System.out.println(huis.getKitchen() + " " + huis.getLivingRoom());
		//huis verwijderen en de kamers van het huis zijn ook verwijderd
		huis = null; 
	}

}
