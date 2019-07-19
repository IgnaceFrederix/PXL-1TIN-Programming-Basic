package be.pxl.opdracht8.shapes;

public class DrawingApp {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(2,3,4,5);
		Circle c1 = new Circle(0,1,5);
		Triangle t1= new Triangle(1,5,3,5,6);
		
		Drawing draw = new Drawing(4);
		draw.add(r1);
		draw.add(r2);
		draw.add(c1);
		draw.add(t1);
		draw.add(new Circle(1,2,3));
		System.out.println("eerste afdruk");
		draw.print();
		draw.remove(r2);
		draw.remove(c1);
		System.err.println("tweede afdruk");
		draw.print();
		draw.add(new Rectangle(1,2,3,4));
		

	}

}
