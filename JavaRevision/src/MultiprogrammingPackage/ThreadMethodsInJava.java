package MultiprogrammingPackage;

class MyThreaddd extends Thread
{
	public MyThreaddd(String name)
	{
		super(name);
	}
	public void run() {
		int i=1;
		while(i<10) {
			System.out.println("This thread: "+i++);
			try{Thread.sleep(200);}catch(Exception e) {System.out.println(e);}
		}
		
	}
}

class MyThreadd extends Thread{
	public MyThreadd(String name) {
		super(name);
		//setPriority(Thread.MIN_PRIORITY+2);

	} 
	public void run() {
		int i = 1;
        while (true) {
            System.out.println(i + " !!!!");
            try {
            	Thread.sleep(600);
            }catch(InterruptedException e){
            	System.out.println(e.toString());
            }
            i++;
        }
	}
}
public class ThreadMethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThreaddd mth= new MyThreaddd("Thread1 new");
			System.out.println("NameL: "+mth.getName());
			System.out.println("priority: "+mth.getPriority());
			System.out.println("State: "+mth.getState());
			mth.setPriority(Thread.MAX_PRIORITY-2);
			mth.start();
			System.out.println("Alive: "+mth.isAlive());
			mth.interrupt();
			MyThreadd t=new MyThreadd("My Thread 1");
			t.setPriority(Thread.NORM_PRIORITY+2);
			//System.out.println(t.getId());		This method is deprecated.
			System.out.println("NAME "+t.getName());
			System.out.println("PRIORITY "+t.getPriority());
			System.out.println("STATE "+t.getState());
			System.out.println("ALIVE "+t.isAlive());
//			t.setDaemon(true);
			t.start();
			Thread mythread=Thread.currentThread();
			try {
				mythread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
			int i = 1;
	        while (true) {
	            System.out.println(i + " main");
	            i++;
	            Thread.yield();
	        }

//			mythread.interrupt();
//			try {MyThreadd.sleep(10000);}catch(Exception e) {}
//			t.interrupt();
//			t.interrupt();

	}

}
