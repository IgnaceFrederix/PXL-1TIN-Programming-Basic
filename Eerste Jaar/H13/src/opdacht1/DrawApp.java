package opdacht1;

public class DrawApp {

	public static void main(String[] args) {
		Shape [] shape = new Shape[3];
		shape[0] = new Circle(2,3,5);
		shape[1]= new Rectangle(8,4,5,2);
		shape[2]= new Triangle(1,1,1);
		//oppervlakte => 30 %
		for(Shape s: shape){
			s.scale(30);
			System.out.println(s.toString());
		}
		//nieuwe opp +> *2
		for(Shape s: shape){
			s.scaleDouble();
			System.out.println(s.toString());
		}

	}

}
