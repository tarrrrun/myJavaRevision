
	class Circle {
		public double rad;
		public double area() {
			double area = Math.PI * rad * rad;
			
			return area;
		}
		
		public double perimeter() {
			double peri = Math.PI * 2 * rad;
			return peri;
		}
		public double circumference() {
			return perimeter();
		}
	}

public class Circle1 {

	
	
	public Circle1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.rad = 12.34;
		c2.rad= 15;
		
		
		System.out.println("area ="+ c1.area());
		System.out.println("perimeter ="+ c1.perimeter());
		System.out.println("circumference ="+ c1.circumference());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("area ="+ c2 .area());
		System.out.println("perimeter ="+ c2 .perimeter());
		System.out.println("circumference ="+ c2 .circumference());
		
	}

}
