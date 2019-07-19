package be.pxl.h9.lesOpdracht2;

public class HouseApp {

	public static void main(String[] args) {
		House huis = new House();
		System.out.println(huis.getKitchen().getName() + " " + huis.getLivingRoom().getName());
	}

}
