package be.pxl.h6.oef6;
import java.awt.Point;
public class Oef6 {

	public static void main(String[] args) {
		Point p1;
	 p1= new Point (5,8);
		Point p2 = new Point(p1);
		if(p1 == p2)
		{
			System.out.println("de punten hebben dezelfde verwijzing");
		}else{
			System.out.println("de punten hebben een andere verwijzing");
		}
		if(p1.equals(p2))
		{
			System.out.println("de waardes zijn hetzelfde");
		}else{
			System.out.println("de waardes zijn anders");
		}
			p2.translate(2,3);
		
		System.out.println("de x en y voor p1 zijn : " + p1.x +"-"+p1.y);
		System.out.println("de x en y voor p2 zijn : " + p2.x+"-"+p2.y);
	}

}
