class ThreadIntrruptDemo
{
	public static void main(String[] args)throws InterruptedException{
		MyThread t=new MyThread();
      	t.start();
		t.interrupt();
		System.out.println("End of main");
	}
}

class MyThread extends Thread{
	public void run()
		{
		try{
		for(int i =0;i<10;i++){
		    System.out.println("I am lazy "+i);
			//if(i==7)
	    	Thread.sleep(1000);
			
		}
		}catch(InterruptedException e){
		System.out.println("I got interrupeted !!");
		  }
	}
}

