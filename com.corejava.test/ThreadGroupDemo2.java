class ThreadGroupDemo2 
{
	public static void main(String[] args) 
	{
		ThreadGroup g1=new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());//main
		ThreadGroup g2=new ThreadGroup(g1,"Second Group");
		System.out.println(g2.getParent().getName());//Second Group
		System.out.println(g1.getMaxPriority());//10
		System.out.println(g2.getMaxPriority());//10
		System.out.println(g1.getParent().getMaxPriority());//10
	}
}
