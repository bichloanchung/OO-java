package geometry;
/*
 * Exercises 16_05
 */
public class main {

	public static void main(String[] args) {
		triangle t = new triangle(0.0,0.0);
		t.setBase(2);
		t.setHeight(8);
		
		System.out.println(t.computeArea());
		
		circle c = new circle(0.0);
		c.setRadius(6);
		
		System.out.println(c.computeArea());
	
	}

}
