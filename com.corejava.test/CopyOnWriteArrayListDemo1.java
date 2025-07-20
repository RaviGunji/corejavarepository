import java.util.concurrent.*;
import java.util.*;
class CopyOnWriteArrayListDemo1 
{
	public static void main(String[] args) 
	{
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add("A");
		al.add("A");
		System.out.println(al);//[A A];
		System.out.println(al.addIfAbsent("B"));//true
		System.out.println(al.addIfAbsent("A"));//false
		System.out.println(al);//[A A B]
	}
}
