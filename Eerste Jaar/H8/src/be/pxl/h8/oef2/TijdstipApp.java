package be.pxl.h8.oef2;

public class TijdstipApp {

	public static void main(String[] args) {
		 Tijdstip t1 = new Tijdstip();
		t1.setUren(28);
		t1.getVerbeter(t1.getUren());
		t1.getVerbeter(t1.getMinuten());
		t1.setMinuten(70);
		t1.setSec(5);
		t1.print();
	}

}
