package be.pxl.h8.oef1;

import java.util.Scanner;

public class Persoon {
	private String voornaam;
	private String naam;
	private double lengte;
	private double gewicht;
	private int geboortejaar;
	private StringBuilder s1 = new StringBuilder();
			
			public int getleeftijd(){
				int leeftijd = 2015-geboortejaar;
				return leeftijd;
				
			}
			
			
		

	public void voegVoornamenToe(String... extraVoornaam) {
		for (String s : extraVoornaam) {
			s1= s1.append(getNaam());
			s1 = s1.append(" " + s);
		}
	}


	
	public void setVoornaam(String voornaam) {
		this.voornaam = s1.toString();
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void grow()
	{
		setLengte(lengte+0.01);
		//this.lengte = this.lengte+0.01;
		//System.out.printf("%.2f \n",lengte );
	}
	
	public void grow(int lengte)
	{
		setLengte(lengte/100.0+this.lengte);
		//lengte = this.lengte+ lengte;
	}
	

	public void setLengte(double lengte) {
		this.lengte = lengte;
		if(this.lengte > 2.4)
		{
			this.lengte =2.4;
		}
	}
	

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public double getLengte() {
		return lengte;
	}

	public double getGewicht() {
		return gewicht;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	

	
	public void print() {
		System.out.println("deze persoon is " + voornaam  + " " + naam);
		System.out.printf("gewicht" + "\t " + ":" + "%.2f \n", gewicht);
		System.out.printf("lengte" + "\t" + ":" + "%.2f \n", lengte);
		System.out.printf("geboortejaar" + "\t" + ":" + "%d \n", +geboortejaar);
	}

	public void printBMI() {
		double bmi;
		bmi = gewicht / (lengte * lengte);
		if (bmi < 18) {
			System.out.println("er is ondergewicht");
		} else {
			if (bmi < 25) {
				System.out.println("het is normaal");
			} else {
				if (bmi < 30) {
					System.out.println("er is overgewicht");
				} else {
					if (bmi < 40) {
						System.out.println("er is obesitas");
					} else {
						System.out.println("er is moride obesitas");
					}
				}
			}
		}

	}

}
