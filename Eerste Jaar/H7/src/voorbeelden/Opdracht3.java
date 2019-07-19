package voorbeelden;

public class Opdracht3 {

	public static void main(String[] args) {
		int [][] tabel = new int [4][6];
		for(int i = 0; i < tabel.length; i++){
			for(int j =0; j < tabel[i].length; j++){
				tabel[i][j] = (i+1)*(j+1);
			}
		}
		for(int [] rij : tabel){
			for (int get : rij){
				System.out.printf("%4d", get);
			}
			System.out.println();
		}
		int som;
		for(int j = 0; j < tabel[0].length; j++){
			som =0;
			for(int i=0; i < tabel.length; i++){
				som = som+tabel[i][j];
			}
			System.out.printf("som van kolom nr : %d is %d \n", j,som);
		}
		for(int i =0; i < tabel.length; i++){
			som =0;
			for(int j=0; j < tabel[i].length; j++){
				som = som+tabel[i][j];
			}
			System.out.printf("som van kolom nr : %d is %d \n", i,som);
		}
	}

}
