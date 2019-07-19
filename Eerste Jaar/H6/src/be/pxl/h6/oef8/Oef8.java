package be.pxl.h6.oef8;
import java.awt.Rectangle;
import java.util.Random;
public class Oef8 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Rectangle r100 = new Rectangle(0,0,100,100);
		System.out.println("Gemaakte rechthoeken");
		System.out.println("x \t y \t breedre hoogte");
		Rectangle rectg = new Rectangle();
		Rectangle rect = new Rectangle();
		for(int i = 1; i <= 20; i++)
		{
		int	rx = rand.nextInt(100);
		int ry = rand.nextInt(100);
		int rh = rand.nextInt(71)+1;
		int rw = rand.nextInt(71);
		
		rect = new Rectangle(rx,ry,rh,rw);
		if(r100.contains(rect))
		{
			System.out.print(rect.x+" \t ");
			System.out.print(rect.y+" \t");
			System.out.print(rect.width+" \t ");
			System.out.print(rect.height+" \t ");
			System.out.println("geplaatst");
			System.out.println("rect "+ i) ;
		}
		if(rect.width*rect.height > rectg.width*rectg.height)
		{
			rectg.width =  rect.width;
			rectg.height = rect.height;
			rectg.x = rect.x;
			rectg.y = rect.y;
		}
		
		}
		System.out.println("de grootste geplaatse rechtoek : xy ="+ rectg.x+"-"+rectg.y+" , breedte =   "+rectg.width+", hoogte = " +rectg.height  );

	}

}
