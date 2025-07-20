 class InterTest implements I 
{
	 public void m1(){
		System.out.println("M1 Implementation");
	}
	public static void main(String[] args) 
	{
		I it=new InterTest();
		it.m1();
//		System.out.println("Hello World!");
	}
}
interface I
{
	void m1();
	//void m2();
}
