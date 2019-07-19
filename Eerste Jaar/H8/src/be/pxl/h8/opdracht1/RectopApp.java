package be.pxl.h8.opdracht1;



public class RectopApp {

	public static void main(String[] args) {
		Opdracht1	rect = new Opdracht1();
		System.out.println("oppervlakte"+ rect.getArea());
		System.out.println("omtrek"+rect.getPerimeters());
		System.out.println("hoogte"+rect.getHeight());
		System.out.println("breedte"+ rect.getWidth());
		System.out.println("x"+rect.getX());
		System.out.println("y"+ rect.getY());
		rect.setHeight(5);
		rect.setWidth(10);
		rect.setX(0);
		rect.setY(2);
		

		System.out.println("oppervlakte"+ rect.getArea());
		System.out.println("omtrek"+rect.getPerimeters());
		System.out.println("hoogte"+rect.getHeight());
		System.out.println("breedte"+ rect.getWidth());
		System.out.println("x"+rect.getX());
		System.out.println("y"+ rect.getY());
		Opdracht1 rect2 = new Opdracht1();
		rect2.setHeight(-4);
		rect2.setWidth(8);
		rect2.setX(9);
		rect2.setY(7);
		rect2.grow(-5);
		System.out.println("oppervlakte"+ rect2.getArea());
		System.out.println("omtrek"+rect2.getPerimeters());
	
		System.out.println("hoogte"+rect2.getHeight());
		System.out.println("breedte"+ rect2.getWidth());
		System.out.println("x"+rect2.getX());
		System.out.println("y"+ rect2.getY());
		Opdracht1 rect3 = new Opdracht1 (9,9);
		System.out.println("hoogte"+rect3.getHeight());
		System.out.println("breedte"+ rect3.getWidth());
		Opdracht1 rect4 = new Opdracht1(-1,2,6,2);
		System.out.println("hoogte"+rect4.getHeight());
		System.out.println("breedte"+ rect4.getWidth());
		System.out.println("x"+rect4.getX());
		System.out.println("y"+ rect4.getY());
		Opdracht1 rect5 = new Opdracht1(rect4);
		System.out.println("hoogte"+rect5.getHeight());
		System.out.println("breedte"+ rect5.getWidth());
		System.out.println("x"+rect5.getX());
		System.out.println("y"+ rect5.getY());
		
	}

}
