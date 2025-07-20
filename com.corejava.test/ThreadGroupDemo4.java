class ThreadGroupDemo4 
{
	public static void main(String[] args) 
	{
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
		MyThread t1=new MyThread(pg,"Child Thread1");
		MyThread t2=new MyThread(pg,"Child Thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());//2
		System.out.println(pg.activeGroupCount());//1
		pg.list();
			try{
		Thread.sleep(5000);
	}catch(Exception e){}
		System.out.println(pg.activeCount());//0
		System.out.println(pg.activeGroupCount());//1
	pg.list();
	}
}

class MyThread extends Thread{
MyThread(ThreadGroup p,String name){
		super(p,name);//if commented our child thread will not register into parent group and name
}
public void run(){
	System.out.println("Child Thread");
	try{
		Thread.sleep(2000);
	}catch(Exception e){}
}
}
