class SynchronizedBlockTest 
{
	public static void main(String[] args) 
	{
		Display g=new Display();
		MyThread t1=new MyThread(g,"Chiru");
		t1.start();
		MyThread t2=new MyThread(g,"NTR");
		t2.start();

	}
}

class MyThread extends Thread
{
  public Display g;
  public String name;
  MyThread(Display g,String name){
	this.g=g;
	this.name=name;
  }
  public void run(){
		g.wish(name);
  }
}
class Display
{
	public   void wish(String name){
		synchronized(this){
		try{
		for(int i=0;i<10;i++){
			System.out.print("Good Morning :");
			Thread.sleep(2000);
			System.out.println(name);
		}
		}catch(InterruptedException e){
		}
		}
	}
}
