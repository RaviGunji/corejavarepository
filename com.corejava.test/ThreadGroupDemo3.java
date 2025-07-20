class ThreadGroupDemo3 
{
	public static void main(String[] args) 
	{
		ThreadGroup g=new ThreadGroup("tg");
		Thread t1=new Thread(g,"Thread 1");
		Thread t2=new Thread(g,"Thread 2");
		g.setMaxPriority(3);
		Thread t3=new Thread(g,"Thread 3");
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		System.out.println(t3.getPriority());//3
	}
}

/* All Methods in Thread Group Class
1) String getName();
2)int getMaxPriority();
3)void setMaxPriority(int p);
4)ThreadGroup getParent()
5)void list();
6)int activeCount();
7)int activeGroupCount();
8)int enumerate(Thread[] t);
9)int enumerate(ThredGroup[] tg);
10)boolean isDaemon();
11)void setDaemon(Boolean b);
12)void interrupt();
13)void destroy();



*/
