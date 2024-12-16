
class Rectangle{
	private int length;private int breadth;
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	void setLength(int l) {
		if (l>0) {
		length=l;
		System.out.println("Length set to "+l+" successfully.");
		}else {
			length=0;  
		}
	}
	void setBreadth(int b) {
		breadth = b;
		System.out.println("Breadth set to "+b+" successfully.");
	}
	float getArea() {
		return getLength()*getBreadth();
	}
	public double getPerimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if (length==breadth) {
			return true;}
		else {
			return false;
		}
	}
}
public class dataHiding {

	public dataHiding() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r2= new Rectangle();
		r2.setLength(20);
		r2.setBreadth(20);
		System.out.println(r2.getArea());
		r2.getBreadth();
		System.out.println("Length is "+r2.getLength());
		System.out.println("Breadth is "+r2.getBreadth());
		System.out.println("Perimeter is --> "+r2.getPerimeter());
		System.out.println("Is Square -->"+r2.isSquare());
	}

}
