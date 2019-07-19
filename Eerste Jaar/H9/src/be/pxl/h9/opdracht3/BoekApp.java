package be.pxl.h9.opdracht3;

public class BoekApp {

	public static void main(String[] args) {
		Boek boek1 = new Boek();
		boek1.setTitel("prog");
		boek1.setIsbn("1254558528");
		boek1.setBldz(5);
		boek1.getAuteur().setNaam("harry");
		boek1.getAuteur().setVoornaam("pot");
		System.out.println(boek1.getAuteur().toString());
		boek1.toonBoekGegevens();

	}

}
