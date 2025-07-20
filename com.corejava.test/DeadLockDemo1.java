class DeadLockDemo1 extends Thread
{
	static A a=new A();
	static B b =new B();
		
	public static void main(String[] args) 
	{
		DeadLockDemo1 deadLock=new DeadLockDemo1();
		deadLock.start();
		b.d2(a);
	}
	public void run(){
		a.d1(b);
	}
}

class A 
{
	public synchronized void d1(B b){
	System.out.println("Thread1 start executing d1()");
	try{
		Thread.sleep(2000);
	}catch(Exception e){}
	System.out.println("Thread1 trying to execute B's last()");	
	b.last();
	}
	public  void last(){
		System.out.println("Inside A's last()");	
	}
}
class B 
{
	public synchronized void d2(A a){
	System.out.println("Thread2 start executing d2()");
	try{
		Thread.sleep(2000);
	}catch(Exception e){}
	System.out.println("Thread2 trying to execute A's last()");	
	a.last();
	}
	public  void last(){
		System.out.println("Inside A's last()");	
	}
}