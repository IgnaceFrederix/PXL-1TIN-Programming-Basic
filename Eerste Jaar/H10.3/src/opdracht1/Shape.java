package opdracht1;

public abstract class Shape {
	
	private int x;
	private int y;
	private static int aantal;
	
	
	{
		
	}
	public Shape(int x, int y){
		this.x = x;
		this.y = y;
		aantal++;
	}
	
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
		
	}
	public abstract double getArea();
	
	public abstract double getParameter(); 
	
}
