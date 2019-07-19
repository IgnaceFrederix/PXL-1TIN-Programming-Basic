package voorbeelden;
/** Deze klasse is een cirkel. 
*
* @author Mijn PC
*@version 12
*@see voorbeelden.Shape
*
*/
public class Circle extends Shape {
	
	private int straal;
	/**
	 * Met deze constructor wordt een cirkel aangemaakt op basis van straal en x en y coordinaat van het middelpunt
	 * van de cirkel 
	 * @param x x-coordinaar va het mideelpunt van de cirkel
	 * @param y y-coordinaat van het middelpunte van de cirkel
	 * @param straal straal van de cirkel
	 */
	public Circle (int x, int y, int straal) {
		super(x,y);
		this.straal = straal;
	}
/**
 * Deze methode geeft de straal van de cirkel terug
 * @return straat van de cirkel
 */
	public int getStraal() {
		return straal;
	}
	
	/**
	 * met deze methode wordt de straal van de cirkel gewijzigd
	 * @param straal straal van cirkel 
	 * 
	 */

	public void setStraal(int straal) {
		this.straal = straal;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(straal, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * straal;
	}
	//opdracht9
	@Override
	public String toString() {
		return "Circle [straal=" + straal + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	//opdracht10
	public boolean equals (Object o) {
		if (o == null) {
			return false;
		} else {
			if (o.getClass() != this.getClass()) {
				return false;
			} else {
				Circle oCircle = (Circle) o;
				if (oCircle.getX() == this.getX() && oCircle.getY() == this.getY()
					&& oCircle.getStraal() == this.getStraal()) {
						return true;
					} else {
						return false;
					}
				
			}
		}
	}

}
