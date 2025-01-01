


public class FinallyBlockInJava {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			
		try
		{
			System.out.println(5/0);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("finally block");
			
		}
		
		
		
	}

}
