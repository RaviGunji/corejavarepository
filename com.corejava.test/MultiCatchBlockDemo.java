class MultiCatchBlockDemo 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println(10/0);
			String s=null;
	        System.out.println(s.length());
		}catch(ArithmeticException | NullPointerException e ){//sib links can be accepted not parent child and child parent and same type
			System.out.println(e);
		}
	}
}
