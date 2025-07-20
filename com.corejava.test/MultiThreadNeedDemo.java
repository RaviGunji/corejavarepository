class MultiThreadNeedDemo 
{
	public static void main(String[] args) throws Exception
	{
		long startTime = System.currentTimeMillis();
		MyThread t=new MyThread();
		t.start();
		System.out.println("First For Loop Starting");
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			
		}
		System.out.println("First For Loop Ending");

		/*System.out.println("Second For Loop Starting");
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
		}
		System.out.println("Second For Loop Ending");
		*/
		long endTime = System.currentTimeMillis();
		long timeTaken=endTime-startTime;
		System.out.println("Total Time taken for exection : "+timeTaken+" Milli Seconds");
	}
}
class MyThread extends Thread
{
	public void run(){
		System.out.println("Second For Loop Starting");
		for(int i=0;i<5;i++)
		{
			try{
			Thread.sleep(1000);
			}catch(Exception e){
			}
		}
		System.out.println("Second For Loop Ending");
	}
}
