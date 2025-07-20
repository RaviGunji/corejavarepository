import java.util.*;
import java.util.concurrent.*;
class CopyOnWriteArrayListDemo5 extends Thread
{
	
	public static void main(String[] args) throws Exception
	{
		List l=new CopyOnWriteArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		Iterator it=l.iterator();
		l.add(5);// This 5 will not be avlialbe in iterator since it added in cloned copy
		while(it.hasNext()){
			Integer i=(Integer)it.next();
			System.out.println(i);//[1, 2, 3, 4]
    	}
		System.out.println(l);//[1, 2, 3, 4, 5]
		/*Iterator itr=l.iterator();
		while(itr.hasNext()){
			Integer i=(Integer)itr.next();
			System.out.println(i);//[1, 2, 3, 4, 5]
    	}*/
	}
}
