class ThreadJoinDemo
{
	public static void main(String[] args)throws InterruptedException{
		MyThread t=new MyThread();
      	t.start();
		t.start();//till completed t main will wait
		//t.join(2000);// after 2 seconds main thread will start execution
		for(int i =0;i<10;i++){
		System.out.println("Main  Thread -"+i);
	  }
	}
}

class MyThread extends Thread{
	public void run()
		{
		for(int i =0;i<10;i++){
		System.out.println("Child Thread -"+i);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
		}
		}
	}
}

