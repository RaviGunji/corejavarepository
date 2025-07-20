class ExceptionDemo3 
{
	public static void main(String[] args) 
	{
		try{
		System.out.println(10/0);
		}catch(Exception e){
			System.out.println("Exception ");
		}
		catch(ArithmeticException e){
			System.out.println("can't divide with zero");
		}
		/*catch(Exception e){
			System.out.println("Exception ");
		}*/
		
	}
}
