public class ExceptionTestArithematic{
	public static void main(String[] args) {
		try{
		int i=10;
		int j=0;
		int k = i/j;			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}

	}
}