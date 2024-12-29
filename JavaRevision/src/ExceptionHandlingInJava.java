
public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a,b,c;
		a=5;
		b=0;
		c=a/b;
		}catch(ArithmeticException e) {
//			System.out.println("Cannot divide by zero "+e);
			System.out.println(e);	
		}finally {
			System.out.println("finally executed");
		}
		try
		{
			int x[]= {30,20,22,14,54};
		
		int c=x[0]/x[3];
		System.out.println(c);

		System.out.println(x[10]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Executed perfectly while handling errors.");

		}
		
	}

}
