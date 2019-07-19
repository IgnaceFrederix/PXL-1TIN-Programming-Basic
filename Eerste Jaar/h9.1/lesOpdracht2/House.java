package be.pxl.h9.lesOpdracht2;

public class House {
	private Room kitchen = new Room("Kitchen");
	private Room bathroom = new Room("bathroom");
	private Room livingRoom = new Room("livingroom");
	private Room bedroom = new Room("bedroom");
	
	public Room getKitchen() {
		return kitchen;
	}
	public Room getBathroom() {
		return bathroom;
	}
	public Room getLivingRoom() {
		return livingRoom;
	}
	public Room getBedroom() {
		return bedroom;
	}
	
	
}
