package lesOpdracht2;

public class House {
	private Room kitchen = new Room("Kitchen");
	private Room bathroom = new Room("bathroom");
	private Room livingRoom = new Room("livingroom");
	private Room bedroom = new Room("bedroom");
	
	public String getKitchen() {
		return kitchen.getName();
	}
	public String getBathroom() {
		return bathroom.getName();
	}
	public String getLivingRoom() {
		return livingRoom.getName();
	}
	public String getBedroom() {
		return bedroom.getName();
	}
	
	
}
