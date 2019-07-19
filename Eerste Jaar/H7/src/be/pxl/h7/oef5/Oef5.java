package be.pxl.h7.oef5;

import java.awt.Point;
import java.awt.Rectangle;

public class Oef5 {

	public static void main(String[] args) {

		int[] xwaarde = new int[] { 1, 1, 2, 4, 0 };
		int[] ywaarde = new int[] { 1, 0, 2, 1, 2 };
		Point[] p1 = new Point[5];
		Rectangle[] r1 = new Rectangle[5];
		for (int i = 0; i < xwaarde.length; i++) {

			p1[i] = new Point(xwaarde[i], ywaarde[i]);
		}
		for (int i = 0; i < r1.length; i++) {
			r1[i] = new Rectangle(1, 3);
			r1[i].setLocation(p1[i]);

			if (i == 4) {
				r1[4].setRect(0, 0, 2, 3);
			}
			System.out.printf("Rechthoek %d: x:%.0f y:%.0f width: %.0f height: %.0f \n", i + 1, r1[i].getX(),
					r1[i].getY(), r1[i].getWidth(), r1[i].getHeight());
		}

		for (int i = 0; i < r1.length; i++) {
			System.out.printf("De rechthoek %d bevat: ", (i + 1));
			for (int j = 0; j < p1.length; j++) {
				if (r1[i].contains(p1[j])) {
					System.out.printf("\t punt %d", (j + 1));
				}
			}
			System.out.println();
		}
		for (int i = 0; i < (r1.length - 1); i++) {
			if (r1[4].intersects(r1[i])) {
				System.out.printf("Rechthoek %d snijdt rechthoek 5\n", (i + 1));
			}
		}

	}

}