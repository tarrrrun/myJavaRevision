


public class FinallyBlockInJava {
	static int meth1() {
		try {
			System.out.println("xyz");
			return 5/1;
		}finally {
			System.out.println("finally");//Executes before returning in try block
		}
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
			System.out.println(meth1());
		try
		{
			System.out.println(5/2);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("finally block");
			
		}
	
		
		
	}

}
