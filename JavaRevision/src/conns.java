public class conns {
	
	private int length,breadth;
	
	
	public conns(int l,int b) {
		length=l;
		breadth=b;
	}
	public conns(int s) {
		length=breadth=s;
		
	}
	public  conns() {
		length=1;
		breadth=1;
	}
	public void printSides() {
		System.out.println("Length-> "+length+" Breadth-> "+breadth);
	}
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
	public static void main(String[]args) {
		conns co = new conns(5,6);
		conns co1 = new conns();
		co.printSides();
		co1.printSides();
		System.out.println(co.isSquare());
		System.out.println(co.getArea());
		System.out.println(co.getPerimeter());
		System.out.println(co1.isSquare());

	}
}
