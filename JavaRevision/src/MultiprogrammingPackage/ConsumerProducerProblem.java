package MultiprogrammingPackage;

class MyDataaa
{
	int val;
	boolean flag=true;
	synchronized public void set(int x) {
		while (flag!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.val=x;
		flag=true;
		notify();
	}
	synchronized public int get() {
		int x;
		while (flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		x=this.val;
		System.out.println("Producer: "+x);
		flag=false;
		notify();
		return x;
	}
}

class Producerr extends Thread
{
	MyDataaa d;
	public Producerr(MyDataaa dd) {
		this.d=dd;
	}
	public void run() {
		for (int i=0;i<50;i++) {
			d.set(i);
		}
	}
}


class Consumerr extends Thread
{
	MyDataaa d;
	public Consumerr(MyDataaa dd) {
		this.d=dd;
	}
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Consumer: "+d.get());
		}
	}	
}

public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDataaa d=new MyDataaa();
		Producerr p=new Producerr(d);
		Consumerr c =new Consumerr(d);
		p.start();
		c.start();
		
	}

}
