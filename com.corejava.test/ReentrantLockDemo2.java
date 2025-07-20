import java.util.concurrent.locks.*;
class ReentrantLockDemo2
{
	public static void main(String[] args) 
	{
		Greeting g=new Greeting();
		MyThread t1=new MyThread(g,"NTR");
		MyThread t2=new MyThread(g,"Bunny");
		t1.start();
		t2.start();
	}
}
class MyThread extends Thread
{
	Greeting g;
	String name;
	public MyThread(Greeting g,String name){
		this.g=g;
		this.name=name;
	}
	public void run(){
		g.wish(name);
}
}
class Greeting
{
	ReentrantLock l=new ReentrantLock();
public  void wish(String name){
	l.lock();
	for(int i=1;i<=10;i++){
		System.out.println("Good Morning: "+ name);
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
	}
	l.unlock();
}
}
