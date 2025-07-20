class DefaultExceptionHandlingDemo 
{
	public static void main(String[] args) 
	{
		doStuff();//control goes tto line no 8
		//System.out.println(10/0);
		System.out.println("End of main()");
	}
	public static void doStuff(){
		doMoreStuff();//control goes tto line no 12
		//System.out.println(10/0);
		System.out.println("End of doStuff()");
	}
	public static void doMoreStuff(){
		System.out.println(10/0);
		System.out.println("End of doMoreStuff()");
	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultExceptionHandlingDemo.doMoreStuff(DefaultExceptionHandlingDemo.java:15)
        at DefaultExceptionHandlingDemo.doStuff(DefaultExceptionHandlingDemo.java:10)
        at DefaultExceptionHandlingDemo.main(DefaultExceptionHandlingDemo.java:5)
*/
