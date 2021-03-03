package geometry;

public class circle extends shape {
	private double radius = 0.0;

	public circle(double radius) {
		//super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String computeArea() {
		double result = Math.PI * Math.pow(radius, 2);
		return "The area of this Circle is: "+result; 
	}

}
