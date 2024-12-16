	
	class Cylinder{
		public double rad,height;
		
		public double volume() {
			double vol = Math.PI * rad * rad * height;
			return vol;
		}
		public double lidArea() {
			double arr = Math.PI *rad*rad;
			return arr;
			
		}
		public double surfaceArea() {
			double sa = 2 * Math.PI *rad*height + 2 * Math.PI *rad * rad;
			return sa;
		}
	}
	
public class Cylinder1 {

	public Cylinder1() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c1 = new Cylinder();
		c1.rad=15.23;
		c1.height=35.89;
		
		System.out.println("Volume = "+ c1.volume());
		System.out.println("lidArea = "+ c1.lidArea());
		System.out.println("surfaceArea = "+ c1.surfaceArea());

	}

}
