package be.pxl.h7.exeoef6;

public class Exeoef6 {

	public static void main(String[] args) {
		int stem [][] = new int [][]{{105,35,5},{66,21,12},{44,36,56},{56,12,12},{29,10,9}};
		String [][] naam ={{"De chninkel","vanhamme"},{"kuifje in tibet","herge"},{"maus","spiegelmann"},{"herge","kuifje en de blauwe lotus"},{"largo winch: de ergenamen","vanhamme"}};
		int som=0;
		int groot;
		int nrmax = 0;
		groot=0;
		String titel;
		String persoon;
		StringBuilder meeste = new StringBuilder();
		for(int i =0; i < stem.length; i++)
		{
			som=0;
			for(int j =0; j < stem[i].length; j++)
			{
				som = som+stem[i][j];
			}
			for(int j =0; j < naam[i].length;j++){
				System.out.printf(naam[i][j] +"\t");
			}
			System.out.println(som);
			if(groot < som)
			{
				groot = som;
				nrmax=i;
			}
			}
		titel = naam[nrmax][0].toUpperCase();
		persoon = naam[nrmax][1].toUpperCase();
		meeste = meeste.append("de strip met de meeste stemmen is ").append(titel).append(" van auteur ").append(persoon);
		System.out.println();
		System.out.println(meeste);
	}

}
