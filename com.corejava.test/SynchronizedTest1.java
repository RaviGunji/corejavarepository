class SynchronizedTest1 
{
	public static void main(String[] args) 
	{
		Display d=new Display();
		MyThread1 t1=new MyThread1(d);
		t1.start();
		MyThread2 t2=new MyThread2(d);
		t2.start();
	}
}

class MyThread1 extends Thread
{
  public Display d;
  public String name;
  MyThread1(Display d){
	this.d=d;
  }
  public void run(){
		d.displayNumber();
  }
}
class MyThread2 extends Thread
{
  public Display d;
  public String name;
  MyThread2(Display d){
	this.d=d;
  }
  public void run(){
		d.displayChar();
  }
}
class Display
{
	public   synchronized void displayNumber(){
		try{
		for(int i=0;i<10;i++){
			System.out.print(i);
			Thread.sleep(2000);
		}
		}catch(InterruptedException e){
		}
	}

	public   synchronized void displayChar(){
		try{
		for(int i=65;i<75;i++){
			System.out.print((char)i);
			Thread.sleep(2000);
		}
		}catch(InterruptedException e){
		}
	}
}
