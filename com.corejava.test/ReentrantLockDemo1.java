import java.util.concurrent.locks.*;
class ReentrantLockDemo1 
{
	public static void main(String[] args) 
	{
		ReentrantLock l=new  ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked());//true
		System.out.println(l.isHeldByCurrentThread());//true
		System.out.println(l.getQueueLength());//0
		l.unlock();
		System.out.println(l.getHoldCount());//1
		System.out.println(l.isLocked());//true
		l.unlock();
		System.out.println(l.isLocked());//false
		System.out.println(l.isFair());//false
	}
}
