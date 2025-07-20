class ThreadDemo2 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
	}
}
class MyThread extends Thread
{
	/*public void run(){
		System.out.println("no -arg run()");
	}
		public void run(String s){
		System.out.println("String -arg run()");
	}*/
}
