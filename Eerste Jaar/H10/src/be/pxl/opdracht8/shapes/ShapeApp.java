package be.pxl.opdracht8.shapes;

public class ShapeApp {

	public static void main(String[] args) {
		Circle c = new Circle(10,20,50);
		System.out.printf("de oppervlakte .2f \n",c.getArea());
		System.out.printf("de omtrek *.2f \n",c.getPerimerter());
		
		
		Shapes s = new Circle(10,20,50);
		System.out.printf("de oppervlakte .2f \n",s.getArea());
		System.out.printf("de omtrek *.2f \n",s.getPerimerter());
		
		
		System.out.println("info over de cirkel" + c);
		System.out.println("info over de cirkel" + c.toString());
		
		Circle c1 = new Circle(10,20,50);
		if(c.equals(c1)){
			System.out.println("de 2 cirkels zijn gelijk");
		}else{
			System.out.println("de 2 cirkels zijn niet gelijk");
			
		
		}
		Shapes[] shapes = new Shapes[5];
		shapes [0] = new Circle (10,20,50);
		shapes [1] = new Circle (1,5,50);
		shapes[2] = new Rectangle(10,20,5,9);
		shapes[3] = new Rectangle(10,20,15,9);
		shapes[4] = new Triangle (5,20,30);
		
		for(Shapes vorm : shapes){
			System.out.printf("omtrek   %.0f					opplervlakte 		"+ "%.0f \t", vorm.getPerimerter());
			if(vorm instanceof Circle)
				System.out.println("cirkel");
			else if (vorm instanceof Rectangle)
				System.out.println("rechthoek");
			else System.out.println("driekhoek");
			
			
		}

		
	}

}
