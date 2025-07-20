class SynchronizedTest 
{
	public static void main(String[] args) 
	{
		Greeting g1=new Greeting();
		MyThread t1=new MyThread(g1,"Chiru");
		t1.start();
		MyThread t2=new MyThread(g1,"NTR");
		t2.start();
		/*Greeting g2=new Greeting();
		MyThread t2=new MyThread(g2,"NTR");
		t2.start();
		Greeting g3=new Greeting();
		MyThread t3=new MyThread(g3,"BUNNY");
		t3.start();*/
	}
}

class MyThread extends Thread
{
  public Greeting g;
  public String name;
  MyThread(Greeting g,String name){
	this.g=g;
	this.name=name;
  }
  public void run(){
		g.wish(name);
  }
}
class Greeting
{
	public   synchronized  void wish(String name){//static
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
