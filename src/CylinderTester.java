public class CylinderTester {

	public static void main(String[] args) {

		Cylinder a = new Cylinder ();
		a.setRadius(8);
		a.setHeight(12);
		System.out.println("First Cylinder: " + a.toString());
		
		Cylinder b = new Cylinder (6, 22);
		System.out.println("Second Cylinder: " + b.toString());
		
	}

}