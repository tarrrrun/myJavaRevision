package MultiprogrammingPackage;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println(i + " !");
            i++;
        }
    }
}


class MyThread2 implements Runnable{
	public void run() {
		int i = 1;
        while (i < 10) {
            System.out.println(i + " !!!!");
            i++;
        }
	}
	
	
}
public class HelloWorldByThreads extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println(i + " hello");
            i++;
        }
    }

    public static void main(String[] args) {
        HelloWorldByThreads t = new HelloWorldByThreads();
        MyThread tr = new MyThread();
        MyThread2 mtrd=new MyThread2();
        Thread trd = new Thread(mtrd);
        t.start();
        tr.start();
        trd.start();
        int i = 1;
        while (i < 10) {
            System.out.println(i + " world");
            i++;
        }
    }
}
