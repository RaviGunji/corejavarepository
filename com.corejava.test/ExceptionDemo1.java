class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
		System.out.println("You can't division by zero");
		}
		System.out.println("End of main ()");
}
}
