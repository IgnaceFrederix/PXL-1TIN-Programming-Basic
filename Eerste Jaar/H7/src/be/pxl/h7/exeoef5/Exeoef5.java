package be.pxl.h7.exeoef5;

public class Exeoef5 {

	public static void main(String[] args) {
		int stem [][] = new int [][]{{25,36,55,46,38},{35,45,54,65,1},{75,66,44,10,5},{23,33,45,50,49}};
		int test;
		int nrmax=0;
		int hoogste;
		hoogste =0;
		for(int i =0; i < stem.length; i++)
		{
			test=0;
			for(int j =0; j < stem[i].length; j++)
			{
				test = test+stem[i][j]*(j+1); 
			}
			if(hoogste < test)
			{
				hoogste = test;
				nrmax = i;
			}
			System.out.printf("%.2f \n",test/200.0);
			}
		
			System.out.println("het hoogste gewogen gemiddelde is vraag "+nrmax);
		
	}
	

}
