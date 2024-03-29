import java.awt.Graphics;

public abstract class Shaper {
	protected double x1=0,x2=0,y1=0,y2=0;
	protected String type;

	public Shaper(double a, double b, double c, double d,String e) {
		this.x1=a;
		this.x2=c;
		this.y1=b;
		this.y2=d;
		this.type=e;
	}
	
	public String gettype() {
		return this.type;
	}

	public void settype(String x) {
		this.type = x;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	public abstract void drawme(Graphics g);

	public abstract boolean isIn(double a,double b);
}
