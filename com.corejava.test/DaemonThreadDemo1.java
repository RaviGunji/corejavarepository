class DaemonThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		//t.setDaemon(true);
		t.start();
		System.out.println("End Of Main Thread");
		//t.stop();
		}
}
class MyThread extends Thread{
	public void run(){

		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread "+i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}

}
}
