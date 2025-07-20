import java.util.concurrent.locks.*;
class ReentrantLockDemo3
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("Second Thread");
		t1.start();
		t2.start();
	}
}
class MyThread extends Thread
{
	MyThread(String name){
		super(name);
	}
	static ReentrantLock l=new ReentrantLock();
	public void run(){
	if(l.tryLock()){
		System.out.println(Thread.currentThread().getName()+" got Lock and performing safe operations");
		l.unlock();
	}
	else{
		System.out.println(Thread.currentThread().getName()+ " not got lock hence performing alternative operations");
	}
}
}
