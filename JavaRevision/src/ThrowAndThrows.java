class NegativeDimensionException extends Exception{
	public String toString() {
		return "Dimensions cannot be negative";
	}
}

public class ThrowAndThrows {
		
	static int area(int l,int b) throws NegativeDimensionException
	{
		if (l<=0 || b<=0)
		{
			throw new NegativeDimensionException();
		}else {
			return l*b;
		}
	}
	static void meth1() throws NegativeDimensionException
	{
		System.out.println("Area is "+area(5,-3));
	}
	
	
	public static void main(String[] args)throws NegativeDimensionException {
		// TODO Auto-generated method stub
		
		try {
			meth1();
		}
		catch(NegativeDimensionException e){
			System.out.println(e);
		}

	}

}
