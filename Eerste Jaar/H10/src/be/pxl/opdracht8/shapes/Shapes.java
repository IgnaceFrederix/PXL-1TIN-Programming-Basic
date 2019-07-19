package be.pxl.opdracht8.shapes;

public abstract class Shapes {
	private int x,y;
	private static int count=0;
	
	{
		count++;
	}
	public Shapes(int x, int y){
		this.x =x;
		this.y =y;
	}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	public abstract double getArea();
	
	public abstract double getPerimerter();
	
	
	

}
