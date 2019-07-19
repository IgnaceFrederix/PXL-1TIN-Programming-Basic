package be.pxl.h9.opdracht1;

public class Opdracht1App {

	public static void main(String[] args) {
		Owner eig1 = new Owner("Guido");
		Pet pet1 = new Pet("Blacky");
		
		
		eig1.setPet(pet1);
		System.out.println(eig1.getName()+"heef een dier met naam " + eig1.getPet().getName());
		Owner eig2 = new Owner ("lars");
		eig2.setPet(pet1);
		eig1.setPet(null);
		eig2.getPet().setName("zwart");
		System.out.println(eig2.getName()+ "heef een dier met naam " + eig2.getPet().getName());
	}

}
