package be.pxl.h6.oef7;
import java.awt.Rectangle;
import java.awt.Point;
public class Oef7 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2,20,30);
		Point p1 = new Point(5,5);
		
		if(r1.contains(p1))
				{
					System.out.println("het punt zit in het vierkand");
				}else{
					System.out.println("het punt bevind zich niet in het vierkand");
				}
		p1.translate(40, 50);
		Rectangle r2 = new Rectangle(p1.x,p1.y,100,110);
		int r2x = r2.x;
		int r2y = r2.y;
		System.out.println("de x waarde van rect2 is" + r2x+"de y waarde is " + r2y);
		if(r2.contains(r1.x, r1.y))
		{
			System.out.println("rect1 zit volledig in rect2");
		}else{
			System.out.println("rect1 zit niet volledig in rect2");
		}
		r1.translate(40, 80);
		System.out.println(r1.height);
		System.out.println(r2.height);
		if(r1.height == r2.height)
		{
			System.out.println("de hoogte van r1 is gelijk aan r2");
		}else{
			System.out.println("de hoogte is verschillend");
		}
		
		
		
	}

}
