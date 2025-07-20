class ThreadJoinDemo1 extends Thread
{
	public static void main(String[] args)throws InterruptedException{
		MyThread.t=Thread.currentThread();
		MyThread t=new MyThread();
      	t.start();
		//t.join(); Dead lock
		for(int i =0;i<10;i++){
		System.out.println("Main  Thread -"+i);
		Thread.sleep(1000);
	  }
	}
}

class MyThread extends Thread{
	static Thread t=null;
	public void run()
		{
		try{
			t.join();
		for(int i =0;i<10;i++){
		System.out.println("Child Thread -"+i);
		Thread.sleep(1000);
		}
		}catch(Exception e){
		}
		}
	}


