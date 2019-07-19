package be.pxl.opdracht8.shapes;

public class Circle extends Shapes {
	private int r;
	
	
public Circle(int x, int y, int r) {
		
		super(x, y);
		this.r = r;
		
	}
	
	public int getR(){
		return r;
	}
	public void setR(int r){
		this.r = r;
	}

	@Override
	public double getArea() {
	
		return Math.PI*Math.pow(r, 2);
		
	}

	@Override
	public double getPerimerter() {
		return 2*Math.PI*r;
	}
	
	public String toString(){
		return String.format("x= %d, y= %d,r = %d opp: %.1f omrek %.1f", getX(),getY(),r, getArea(),getPerimerter());
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		else if (this.getClass() != o.getClass())
			return false;
		else {
			Circle c = (Circle)o;
			if(c.getX() == this.getX() && c.getY() == this.getY() && c.r == r)
			return true;
			else return false;
		}
	}

}
