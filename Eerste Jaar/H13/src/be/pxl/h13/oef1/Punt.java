package be.pxl.h13.oef1;

public class Punt {
	private int x;
	private int y;
	private static int MAXIMUMGROOTE;
	
	public Punt(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double berekenAfstand(Punt p){
		return Math.sqrt(Math.pow(p.x-this.x, 2)+Math.pow(this.y, p.y));
	}

	
	
	

}
