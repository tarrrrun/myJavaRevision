// NESTED INNER CLASS
class Outer{
	int x=10;
	class Inner{
		int y=20;
		void innerDisplay() {
			System.out.println(x+" "+y);
		}
	}
	
	void  outerDisplay() {
		Inner i =new Inner();
		i.innerDisplay();
		System.out.println("Directly calling inner variable Y --> "+i.y);
	}
}

// LOCAL INNER CLASSES
abstract class My{
	abstract void display();
}

interface MMyy{
	void display();
}
class Outerr{
	public void meth() {
		My m=new My() {
			public void display() {
				System.out.println("hello");
			}
		};
		MMyy mmy=new MMyy(){
			public void display() {
				System.out.println("interface hello");
			}
		};
		mmy.display();
		m.display();
		
	}
}




public class InnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		o.outerDisplay();
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
		Outerr oooo=new Outerr();
		oooo.meth();
	}

}
