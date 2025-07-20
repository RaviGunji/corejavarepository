import java.util.*;
import java.util.concurrent.*;
class CopyOnWriteArrayListDemo4 extends Thread
{
	
	public static void main(String[] args) throws Exception
	{
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		Iterator it=l.iterator();
		while(it.hasNext()){
			Integer i=(Integer)it.next();
			System.out.println(i);//[ 1 2 3 4 ]
			if(i%3==0)
				it.remove();
		}
		System.out.println(l);//[1, 2, 4]
	}
}
