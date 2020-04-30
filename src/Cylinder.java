public class Cylinder {
	private double radius;
	private double height;

	public Cylinder () {
	}
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double getRadius() { 
		return this.radius;
	}
	public double setRadius(double radius) {
		this.radius = radius;
		return radius;
	}
	public double getHeight() {
		return this.height;
	}
	public double setHeight(double height) {
		this.height = height;
		return height;
	}
	public double getBaseDiameter() {
		double baseDiameter = radius*2;
		return baseDiameter;
	}
	public double getBaseArea() {
		double baseArea= (Math.pow(radius, 2) * Math.PI);
		return baseArea;
	}
	public double getBaseCircumfrence() {
		double baseCircumfrence = (radius*2)*Math.PI;
		return baseCircumfrence;
	}
	public double getSurfaceArea() {
		double surfaceArea = (2*Math.PI*radius*height) + 2*(Math.pow(radius, 2)*Math.PI);
		return surfaceArea;
	}
	public double getVolume() {
		double volume = (Math.PI*Math.pow(radius, 2)*height) ;
		return volume;
	}


	public String toString () { 

		String volume = null;
		String baseDiameter = null;
		String baseArea = null;
		String baseCircumfrence = null;
		String surfaceArea = null;

		return("Radius: " + radius + "\n" + "Height: "+ height + "\n" + "Base Diameter: " + baseDiameter + "\n" + "Base Area: " + baseArea + "\n" + "Base Circumference: " + baseCircumfrence + "\n" + "Surface Area: " + surfaceArea + "\n" + "Volume: " + volume) ; 
	}

}