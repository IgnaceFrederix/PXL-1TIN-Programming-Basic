package voorbeelden;

public class Opdracht5 {

	public static void main(String[] args) {
		System.out.println("meter \t voet");
		//System.err.println("meter \t voet");
		for(double m = 1;m <= 20; m+=0.5){
			System.out.printf("%.2f \t %.2f\n" ,m, m*3.2808399);
		}

	}

}
