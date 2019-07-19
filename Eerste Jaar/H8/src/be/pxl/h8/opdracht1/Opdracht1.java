package be.pxl.h8.opdracht1;

public class Opdracht1 {
	private int height;
	private int width;
	private int x;
	private int y;
	
	//constructor
	public Opdracht1 (int h,int b){
		this(0,0,h,b);
	}
	public Opdracht1(){//default constructor
		
	}
	public Opdracht1(int x, int y, int h, int b){
		this.x = x;
		this.y = y;
		setHeight(h);
		setWidth(b);
	}
	public Opdracht1(Opdracht1 rect){
		this(rect.x, rect.y, rect.height, rect.width);
	}

	// methoden om eigenschappen een andere waarde te geven = setters
	public void setHeight(int h) {
		if(h< 0){
			height = -h;
		}else{
			height=h;
		}
		
	}

	public void setWidth(int b) {
		if(b<0)
		{
			width=-b;
		}else{
			width=b;
		}
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void grow(int dw,int dh){
		height = height+dh;
		if(height<0){
			height=0;
		}
		width = width + dw;
		if(width<0){
			width=0;
		}
	}
	// method overloading
	public void grow(int d){
		height = height+d;
		if(height<0){
			height=0;
		}
		width = width + d;
		if(width<0){
			width=0;
		}
	}
	
	//methode om info op te vrage=getters
	
	
	public int getArea(){
		return height*width;
	}
	
	public int getPerimeters(){
		return 2*height+2*width;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
}
