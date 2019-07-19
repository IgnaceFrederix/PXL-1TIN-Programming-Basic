package opdracht1;

public class Cirlce extends Shape {

	
	private double straal;
	
	
	public Cirlce(int x, int y, double straal) {
		super(x, y);
		this.straal = straal;
		// TODO Auto-generated constructor stub
	}
	
	

	public double getStraal() {
		return straal;
	}


	public void setStraal(double straal) {
		this.straal = straal;
	}




	@Override
	public double getArea() {
		
		return straal * straal * Math.PI;
	}
	

	@Override
	public double getParameter() {
		
		return 2* straal * Math.PI;
	}
	
	@Override
	public String toString(){
		return String.format("middelpunt(%d,%d straal %.2f",super.getX(), super.getY(),straal);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(straal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cirlce other = (Cirlce) obj;
		if (Double.doubleToLongBits(straal) != Double.doubleToLongBits(other.straal))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
