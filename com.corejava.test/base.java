class base 
{
	int i=10;
	{
		m1();
		System.out.println("Base Instance Block");
	}
	base(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Base Main");
	}
	public void m1(){
		System.out.println(j);
	}
	{
		System.out.println("Base second instcne block");
	}
	 int j=20;
}
