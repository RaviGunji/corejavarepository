import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class ReentrantLockDemo4
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
		do{
			try{
			if(l.tryLock(2000,TimeUnit.MILLISECONDS)){
				System.out.println(Thread.currentThread().getName()+  " Got lock ");
				try{
					Thread.sleep(10000);
				}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+ "Releasing Lock");
				l.unlock();
				break;
			}else{
				System.out.println(Thread.currentThread().getName()+ " unable to get lock will gry again");
			}
			}catch(Exception e){}
		}while(true);
   }
}
