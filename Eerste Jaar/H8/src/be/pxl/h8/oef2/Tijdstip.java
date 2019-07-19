package be.pxl.h8.oef2;

import java.util.Scanner;

public class Tijdstip {
	private int uren;
	private int minuten;
	private int seconde;

	
	
	
	public int getUren(){
		
		return uren;
	}
	public int getMinuten(){
		
		return minuten;
	}
	public int getSeconde(){
		
		return seconde;
	}
	public void setSec(int s){
		seconde =s;
	}
	public void setUren(int u){
		uren =u;
	}
	public void setMinuten(int m){
		minuten = m;
	}
	
	
	
	
public int getVerbeter(int getallen){
	while(getUren() >=24){
		uren = getUren()-24;
		return uren;
	}
	while(getMinuten() >=60 )
	{
		minuten = getMinuten()-60;
	return minuten;
	}
	while(getSeconde() >=60 )
		seconde = getSeconde()-60;
	return seconde;
		
		}
	
	
	
public void print()
{
	System.out.println(uren);
	System.out.println(minuten);
}
}


