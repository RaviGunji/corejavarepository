class ThreadGroupDemo5
{
	public static void main(String[] args) 
	{
		ThreadGroup tg=Thread.currentThread().getThreadGroup().getParent();
		Thread[] ta=new Thread[tg.activeCount()];
		tg.enumerate(ta);
		for(Thread t:ta){
			System.out.println(t.getName()+"  -  "+t.isDaemon());
		}
	}
}

/*
Reference Handler  -  true
Finalizer  -  true
Signal Dispatcher  -  true
Attach Listener  -  true
main  -  false
*/
