import java.util.*;
class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue(15,new MyComparator());
		p.offer("B");
		p.offer("D");
		p.offer("A");
		p.offer("C");
		System.out.println(p);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		return o2.toString().compareTo(o1.toString());
}
}
