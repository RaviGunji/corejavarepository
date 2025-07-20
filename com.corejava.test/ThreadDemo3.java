class ThreadDemo3 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();// No new thread will start since we have overriden start method it will work as normal flow
		System.out.println("Main method");
	}
}
class MyThread extends Thread
{
	public void start(){
		System.out.println("start method");
	}
		public void run(){
		System.out.println("run method");
	}
}

/*
start method// produced by main thread
Main method// produced by main thread
*/
