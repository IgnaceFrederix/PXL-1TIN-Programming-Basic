package be.pxl.h5.exeoef19;

public class Exeoef19 {

	public static void main(String[] args) {
		long j;
		j = 2;
		double uitkomst;
		long groot;
		uitkomst = 0;
		groot =0;
		for(int i =1; i < 24; i = i+2)
		{
			
			uitkomst =uitkomst+ Math.pow(i,j);
			j++;
			groot =(long)uitkomst;
			
		}
		System.out.println(groot);

	}

}
