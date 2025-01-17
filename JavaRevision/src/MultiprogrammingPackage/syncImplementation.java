package MultiprogrammingPackage;

class dispClass{
	synchronized void disp(String str)
	{
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThreaddd1 extends Thread{
	dispClass d;
	public MyThreaddd1(dispClass dd) {
		this.d=dd;
	}
	public void run() {
		d.disp("Hello Wordld ");
	}
}
class MyThreaddd2 extends Thread{
	dispClass d;
	public MyThreaddd2(dispClass dd) {
		this.d=dd;
	}
	public void run() {
		d.disp("Second time ");
	}
}
public class syncImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dispClass dc=new dispClass();
		MyThreaddd1 mt1=new MyThreaddd1(dc);
		MyThreaddd2 mt2=new MyThreaddd2(dc);
		mt1.start();
		mt2.start();
		
		
		

	}

}
