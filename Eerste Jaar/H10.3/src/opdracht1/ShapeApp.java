package opdracht1;

public class ShapeApp {

	public static void main(String[] args) {
		//Shape s = new Shape(2,3); fout shape is een abstracte klasse en kan enkel gebruikt worde door extends
		Cirlce c = new Cirlce(10,20,30);
		
		c.setPosition(1,5);
		System.out.println(c.getArea());
		System.out.printf("%.2f%n",c.getParameter());
		
		Shape s = new Cirlce(1,2,3);
		System.out.println(s.getParameter());
		
		System.out.println(c);
		System.out.println(c.toString());
		
		Cirlce c1 = new Cirlce(10,20,50);
		Cirlce c2 = new Cirlce(1,5,50);
		
		if(c1.equals(c2)){
			System.out.println("de 2 cirkels zijn hetzlefde");
		}else{
			System.out.println("de 2 cirkels zijn verschilled");
		}
		
		
		
		
		Rectangle r1 = new Rectangle(10,20,5,9);
		Rectangle r2 = new Rectangle(100,20,15,9);
		Triangle d = new Triangle(5,20,30);
		Shape[] arrayShape = {c1,c2,r1,r2,d};
		
		for(Shape s2 : arrayShape){
			System.out.printf("omtrek: %10.0f oppervlakte: %10.0f \n", s2.getParameter(), s2.getArea());
		}
	}
	

	
	
	
	
	
	

}
