class ThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		//t.run();
		try{
		Thread.sleep(3000);
		}catch(Exception e){}
		//t.start();//IllegalThreadStateException
		for(int i=0;i<10;i++){
			System.out.println("Main Thread "+i);
		}
	}
}
class MyThread extends Thread
{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread "+i);
		}
	}
}
/*
Main Thread 0
Child Thread 0
Child Thread 1
Main Thread 1
Child Thread 2
Main Thread 2
Child Thread 3
Main Thread 3
Main Thread 4
Main Thread 5
Main Thread 6
Main Thread 7
Child Thread 4
Main Thread 8
Child Thread 5
Child Thread 6
Child Thread 7
Main Thread 9
Child Thread 8
Child Thread 9*/