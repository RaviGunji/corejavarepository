class ThreadDemo5 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		System.out.println("Main Method");
		//t.start(); R.E : IllegaThreadStateException
	}
}
class MyThread extends Thread
{
	public void run(){
		System.out.println("Run Method");
	}
}
