class ThrowsDemo2 
{
	public static void main(String[] args)throws InterruptedException 
	{
		doStuff();
	}
	public static void doStuff() //throws InterruptedException
		{
		doMoreStuff();
	}
	public static void doMoreStuff()//throws InterruptedException
		{
		//try{
		Thread.sleep(2000);
		//}catch(InterruptedException e){
		//}
	}
}
