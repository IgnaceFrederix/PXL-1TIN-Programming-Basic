package oef1;


import java.util.Scanner;

public class Datum {
	private int dag, maand, jaar;
	private String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public Datum() {
		this(1, 1, 2016);
	}

	public Datum(int d, int m, int j) {
		setDag(d);
		setMaand(m);
		setJaar(j);
	}

	public void print() {
		System.out.printf("%d %s %d", dag, maandNamen[maand - 1], jaar);
	}

	public Datum(Datum date) {
		this(date.getDag(), date.getMaand(), date.getJaar());
	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		Scanner keyboard = new Scanner(System.in);
		while (maand < 1 || maand > maandNamen.length) {
			System.out.println("Geef een andere waarde voor maand in van 1 t.e.m. 12");
			maand = keyboard.nextInt();
		}
		keyboard.close();
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public String getMaandNaam() {
		return maandNamen[maand - 1];
	}
}
