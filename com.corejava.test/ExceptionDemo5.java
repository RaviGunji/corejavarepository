class ExceptionDemo5 
{
	static ArithmeticException e;
	public static void main(String[] args) 
	{
		try{
			throw e;
		}catch(Exception e){
		}
	}
}
