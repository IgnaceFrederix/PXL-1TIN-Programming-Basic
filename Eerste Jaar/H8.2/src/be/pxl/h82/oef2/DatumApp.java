package be.pxl.h82.oef2;


public class DatumApp {

	public static void main(String[] args) {
		
		Datum d1 = new Datum(5,3,2015);
		Datum d2 = new Datum();
		
		Datum[] lijst= {d1,d2};
		lijst[0] = d1;
		lijst[1] = d2;
		for(Datum datum : lijst)
		{
			datum.print();
		}
		
	}

}
