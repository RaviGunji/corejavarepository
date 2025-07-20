import java.util.concurrent.*;
import java.util.*;
class CopyOnWriteArrayListDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("C");
		l.add("D");
		l.add("B");
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add("A");
		System.out.println(al);//[A ];
		System.out.println(al.addIfAbsent("B"));//true
		System.out.println(al);//[A B]
		System.out.println(al.addAllAbsent(l));//2
		System.out.println(al);//[A B C D]
	}
}
