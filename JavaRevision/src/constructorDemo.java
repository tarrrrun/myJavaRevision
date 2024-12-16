
public class constructorDemo {
	 int length;  int breadth;
	 
	 public constructorDemo(){
		 this.length=1;
		 this.breadth=1;
	 }
	 
	
	public constructorDemo(int l,int b) {
		// TODO Auto-generated constructor stub
		length=l;
		breadth=b;
		
	}
	public void setLength(int l) {
		if (l>0) {
		length=l;
		System.out.println("Length set successfully to "+l);
		}else {
			length=0;
		}
		}
	public void setbreadth(int l) {
		if (l>0) {
		breadth=l;
		System.out.println("breadth set successfully to "+l);
		}else {
			breadth=0;
		}
		}
	public  int getLength() {
		return length;
	}
	public  int getBreadth() {
		return breadth;
	}
	public  int getArea() {
		return length*breadth;
	}
	public int getPerimeter() {
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		constructorDemo cd1= new constructorDemo(2,5);
		System.out.println(cd1.getLength());
		System.out.println(cd1.getBreadth());
		System.out.println(cd1.getArea());
		System.out.println(cd1.getPerimeter());
		constructorDemo cd2= new constructorDemo();
		System.out.println(cd2.getArea());
	}

}
