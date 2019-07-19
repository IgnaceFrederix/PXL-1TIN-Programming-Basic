package be.pxl.h8.opdracht1;



public class RectopAppArr {

	public static void main(String[] args) {
		Opdracht1[]	rect = new Opdracht1 [5];
		int []x = {5,4,9,7,7};
		int []y= {7,8,9,4,2,0};
		int []h = {7,9,4,6,4};
		int []b = {8,7,4,2,0};
		
		
		// aanmaken van 5 rechthoeken
		for(int i=0; i < rect.length; i++)
		{
			rect[i] = new Opdracht1(x[i],y[i],h[i],b[i]);
		}
		for(int i=0; i < rect.length; i++){
			System.out.println("gegevens van rechthoek"+ (i+i));
			System.out.println(rect[i].getHeight());
			System.out.println(rect[i].getWidth());
			System.out.println(rect[i].getX());
			System.out.println(rect[i].getY());
			System.out.println(rect[i].getArea());
			System.out.println(rect[i].getPerimeters());
		}
	}

}
