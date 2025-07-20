import java.util.*;
class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue();
		System.out.println(p.peek());
//		System.out.println(p.element()); RE Expception NoSuchElementFoundExcpetion
		for(int i=0;i<5;i++){
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}
}
