package MultiprogrammingPackage;
class MyData
{
	synchronized void disp(String str) {

			for (int i=0;i<str.length();i++)
			{
				System.out.print(str.charAt(i));
				try {
					Thread.sleep(650);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.toString());
				}
			}
	}
}
class MyThread1 extends Thread
{
	MyData d;
	MyThread1(MyData dat){
		d=dat;
	}
	public void run() 
	{
		d.disp("Hello World ");
	}
}
class MyThreadd2 extends Thread
{
	MyData d;
	MyThreadd2(MyData dat)
	{
		d=dat;
	}
	public void run() {
		d.disp("Welcome");
	}
}
public class SynchronisationInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData d=new MyData();
		MyThread1 mt1=new MyThread1(d);
		MyThreadd2 mt2=new MyThreadd2(d);
		mt1.start();
		mt2.start();
	}

}
