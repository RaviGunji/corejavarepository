class DaemonDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isDaemon());//false
		//Thread.currentThread().setDaemon(true);//IllegalThreadStateException
		MyThread t=new MyThread();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		System.out.println(t.isDaemon());//true
		}
}
class MyThread extends Thread{


}
