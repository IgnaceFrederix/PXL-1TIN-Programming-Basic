package voorbeelden;

import java.awt.Point;

public class Extraoef6 {

	public static void main(String[] args) {
		//maak een 2 dimensonale array punt hieeonder vind je de x coordinaat en de y voordinaat van de punten in deze tabel
		// druk kolom per kolom van elk punt de x coordinaat en de y coordinaat af.
		Point [][] punt = new Point[5][6];
		for(int i = 0; i < punt.length; i++){
			for(int j = 0; j < punt[i].length; j++){
				punt[i][j] = new Point(i*2, j*10);
			}
		}
		for(int j = 0; j < punt[0].length; j++){
			for(int i = 0; i < punt.length; i++){
				System.out.printf("(%2d,%2d)  " , punt[i][j].x, punt[i][j].y);
			}
			System.out.println();
		}

	}

}
