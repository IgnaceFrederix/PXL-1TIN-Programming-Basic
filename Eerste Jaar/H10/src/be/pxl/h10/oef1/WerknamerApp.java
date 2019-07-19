package be.pxl.h10.oef1;

public class WerknamerApp {

	public static void main(String[] args) {
		 Werknemer w1  = new Werknemer("ietd","ide");
		 Werknemer w2 = new Werknemer("ietzs","ied","test",5);
		 Manager m1 = new Manager("iets","iets","iede",5,50);
		 w1.print();
		 w2.print();
		 m1.print();

	}

}
