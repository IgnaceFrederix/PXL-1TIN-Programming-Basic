package H13.bin.be.pxl.H13.opdracht;

import java.awt.Graphics;

public class Triangle extends Shape implements Drawable{
	   private int width;
	   private int height;
	   private int perpendicular;
	   
	   public static final int ANGLES = 3;
	   private static int count = 0;

	   {
	      count++;
	   }
	   
	   public Triangle() {
	      this(0,0,0,0,0);
	   }
	   
	   public Triangle(int width, int height, int perpendicular) {
	      this(width,height,perpendicular,0,0);
	   }
	   
	   public Triangle(int width, int height, int perpendicular, int x, int y){
	      super(x,y);
	      setWidth(width);
	      setHeight(height);
	      setPerpendicular(perpendicular);
	   }
	   
	   public Triangle(Triangle tri){
	      this(tri.width, tri.height, tri.perpendicular, tri.getX(), tri.getY());
	   }
	   
	   public void setWidth(int width) {
		   if (width < 0) {
				this.width = -width;
			} else {
				this.width = width;
			}
	   }
	   
	   public void setHeight(int height) {
		   if (height < 0) {
				this.height = -height;
			} else {
				this.height = height;
			}
	   }
	   
	   public void setPerpendicular(int perpendicular){
	      this.perpendicular = perpendicular;
	   }
	      
	   public double getArea() {
	      return (width * height)/2;
	   }
	   
	   public double getPerimeter() {     
	      return width + Math.hypot(height,perpendicular) + Math.hypot(height,(width-perpendicular)); 
	   }
	   
	   public int getWidth() {
	      return width;
	   }
	   
	   public int getHeight() {
	      return height;
	   }
	   
	   public int getPerpendicular() {
	      return perpendicular;
	   }

	   public static int getCount() {
	      return count;
	   }

	   @Override
	   public String toString() {
	      return String.format(
	                  "Triangle [width=%s, height=%s, perpendicular=%s, x=%s, y=%s]",
	                  width, height, perpendicular, getX(), getY());
	   }
	   
	   @Override
		public boolean equals(Object obj) {
			if (obj != null && this.getClass() == obj.getClass() && ((Triangle) obj).getX() == this.getX()
					&& ((Triangle) obj).getY() == this.getY() && ((Triangle) obj).getHeight() == this.getHeight()
					&& ((Triangle) obj).getWidth() == this.getWidth()  && ((Triangle) obj).getPerpendicular() == this.perpendicular) {
				return true;
			} else {
				return false;
			}

		}

	@Override
	public void scale(int factor) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				double f = Math.sqrt(factor/100.0);
				height =(int) (height*f);
				width = (int)(width*f);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("er wordt een driehoek getekend");
	}
	}

