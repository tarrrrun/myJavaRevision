
class Circlee {
public double radius;
public double area() {return Math.PI * radius*radius;}
public double perimeter() { return Math.PI *2*radius;}
public double circumference() { return perimeter();}
}

class Cylinderr extends Circlee{
	public double height;
	public double volume() {
		return area()*height;
	}
}

public class CircleInheritence {

	public static void main(String[] args) {
		Cylinderr cc= new Cylinderr();
		cc.radius=14;
		cc.height=9;
		System.out.println(cc.volume());
		System.out.println(cc.area());
	}
}
