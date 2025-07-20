class ThreadDemo8
{
	public static void main(String[] args) 
	{
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		MyThread t=new MyThread();
		System.out.println(t.getPriority());
	}
}

class MyThread extends Thread{
	public void run()
		{
	}
}

