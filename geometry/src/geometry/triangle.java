package geometry;

public class triangle extends shape {
	private double base = 0.0;
	private double height = 0.0;
	
	public triangle(double base, double height) {
		//super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public String computeArea() {
		double result = (base * height)/2;
		return "The area of this Triangle is: "+result;
	}
	
}
