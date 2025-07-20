class ThreadDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("NTR");
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		t.start();
		t.setName("Bunny");
		System.out.println(t.getName());
		System.out.println("Main method executing by :"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		//System.out.println(10/0);//Exception in thread "NTR" java.lang.ArithmeticException: / by zero
        //at ThreadDemo7.main(ThreadDemo7.java:12)
	}
}
class MyThread extends Thread
{
	public void run(){
		System.out.println("Run method executing by :"+Thread.currentThread().getName());
	}

}
