package H17.src.be.pxl.h17.oef3.copy;

import java.util.Scanner;

public class Bankrekeing {
	private String rekeningNummer;
	private String naam;
	private double saldo;
	private double rentePerc;

	// opdracht2
	public Bankrekeing() {
		this("geen", "onbekend", 0, 1.2);
	}

	public Bankrekeing(String rekNr, String nm, double sal, double renteP) {
		rekeningNummer = rekNr;
		naam = nm;
		if (sal < 0) {
			saldo = 0;
			System.out.println("Een rekening kan niet met een negatief saldo geopend worden");
		} else {
			saldo = sal;
		}
		if (renteP < 0) {
			rentePerc = 0;
			System.out.println("Een rekening kan niet met een negatief rentepercentage geopend worden");
		} else {
			rentePerc = renteP;
		}
	}

	// opdracht 3
	public void setNaam(String nm) {
		naam = nm;
	}

	public void setRekeningNummer(String rekNr) {
		rekeningNummer = rekNr;
	}

	// opdracht 4
	public double getSaldo() {
		return saldo;
	}

	// opdracht 5
	public void stort(double bedrag) {
		if (controle()) {
			saldo = saldo + bedrag;
			System.out.printf("na storting van %.2f euro \n", bedrag);
			print();
		}
	}

	private boolean controle() { // opdracht 9
		boolean hulp = true;
		if (rekeningNummer.equals("geen")) {
			System.out.println("sorry, geen rekeningnummer");
			hulp = false;
		} else if (naam.equals("onbekend")) {
			Scanner input = new Scanner(System.in);
			System.out.println("Geef de naam van de eigenaar in, staat nog op onbekend");
			naam = input.nextLine();
		}
		return hulp;
	}

	// opdracht 6
	public void neemOp(double bedrag) {
		if (controle()) {
			if (bedrag > saldo) {
				if (saldo == 0) {
					System.out.println("u kan geen geld opnemen");
					bedrag = 0;
				} else {
					System.out.println("u mag enkel " + saldo + " opnemen");
					bedrag = saldo;
				}
			}
			saldo = saldo - bedrag;
			System.out.printf("na opname van %.2f  euro  \n", bedrag);
			print();
		}
	}

	// opdracht 7
	public void verrichting(double... bedragen) {
		if (controle()) {
			for (double bedrag : bedragen) {
				if (bedrag < 0) {
					neemOp(bedrag * (-1));
				} else {
					stort(bedrag);
				}
			}
		}
	}

	// opdracht 8
	public void schrijfRenteBij() {
		if (controle()) {
			double bedrag = saldo * rentePerc / 100;
			saldo = saldo + bedrag;
			System.out.printf("rente wordt bijgeschreven voor %.2f  euro  \n", bedrag);
			print();
		}
	}

	// opdracht 10
	private void print() {
		System.out.print("Saldo op spaarrekening " + rekeningNummer);
		System.out.print(" op naam van " + naam + " bedraagt ");
		System.out.format("%.2f euro%n", saldo);
	}
}
