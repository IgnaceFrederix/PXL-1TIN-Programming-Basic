package be.pxl.h82.oef2;

import java.util.Scanner;

public class Datum {
	
	
	private int dag;
	private  int maand;
	private int jaar;
	private static String[] maandNamen = {"januarie","febuarie","maart","april","mei","juni","juli","augustus","september","oktober","novmeber","december"};
	Scanner input = new Scanner(System.in);
	
	
	public Datum(){
		this(1,1,2016);
	}
	
	
	
	public Datum(int dag,int maand, int jaar){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		
	}


	public int getDag() {
		
		return dag;
	}


	public void setDag(int dag) {
		this.dag = dag;
	}


	public int getMaand() {
		while(maand < 1 || maand > 12)
		{
		if(maand < 1){
			System.out.println(maand);
			System.out.println("geef opnieuw een maand in");
		}
		if(maand > 12){
			System.out.println("geef opnieuw een maand in");
		}
		maand = input.nextInt();
		}
			
		this.maand = maand;
		return maand;
	}
	


	public void setMaand(int maand) {
		this.maand = maand;
	}


	public int getJaar() {
		return jaar;
	}


	public void setJaar(int jaar) {
		this.jaar = jaar;
	}


	public void setMaandNamen(String[] maandNamen) {
		this.maandNamen = maandNamen;
	}
	
	public void print(){
		System.out.println(getDag()+" "+ maandNamen[maand-1] +" "+ jaar);
	}
	
	
	
	}



