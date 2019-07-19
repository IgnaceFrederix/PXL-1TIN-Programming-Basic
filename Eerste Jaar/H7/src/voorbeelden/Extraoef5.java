package voorbeelden;

import java.awt.Point;
import java.util.Random;

public class Extraoef5 {

	public static void main(String[] args) {
		//maak een 1 dimensonale array "punt" waarin 5 objecten van de klasse Point komen
		// geef aan elk punt een xcoordinaat(>=1 en <+10 en een y-coordinaat(veelvoud van 5,>=5 en <=30)
		// druk van elk punt x-coordinaat en ycoordinaat af
		Point []punt = new Point[5];
		Random r = new Random();
		int x,y;
		for(int i=0; i < punt.length; i++){
			 x=r.nextInt(10)+1;
			 y = (r.nextInt(6)+1)*5;
			punt [i] = new Point(x,y);
		}
		for (Point p : punt) {
			System.out.printf("[x = %2d, y = %2d ] \n", p.x, p.y);
		}

	}

}
